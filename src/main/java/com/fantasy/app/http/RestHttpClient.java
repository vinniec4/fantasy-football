package com.fantasy.app.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * The type Rest http client.
 */
public class RestHttpClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestHttpClient.class);

    /**
     * Basic RESTful webservice GET call.
     *
     * @param <T>     mapped class type
     * @param uri     of endpoint to call
     * @param clazz   response mapped back to this class
     * @param headers list of headers to add
     * @return mapped object response
     * @throws IOException getting response
     */
    public static <T> T get(String uri, Class<T> clazz, List<Header> headers) throws IOException {
        String result = "";
        HttpGet request = new HttpGet(uri);
        addRequestHeaders(headers, request);

        try (CloseableHttpResponse response = HttpClients.createDefault().execute(request)) {
            LOGGER.trace("get request response status: {}", response.getStatusLine());
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                result = EntityUtils.toString(entity);
            }
        }
        return mapResult(clazz, result);
    }

    /**
     * Basic RESTful webservice POST call.
     *
     * @param <T>     mapped class type
     * @param uri     of endpoint to call
     * @param json    sending into POST
     * @param classT  response mapped back to this class
     * @param headers list of headers to add
     * @return mapped object response
     * @throws IOException getting response
     */
    public static <T> T post(String uri, String json, Class<T> classT, List<Header> headers)
            throws IOException {
        String result;
        HttpPost post = new HttpPost(uri);
        post.setEntity(new StringEntity(json));
        LOGGER.debug("posting json:" + json);
        addRequestHeaders(headers, post);

        try (CloseableHttpResponse response = HttpClients.createDefault().execute(post)) {
            LOGGER.trace("post request response status: {}", response.getStatusLine());
            result = EntityUtils.toString(response.getEntity());
        }
        return mapResult(classT, result);
    }

    /**
     * Create auth header header.
     *
     * @param authString the auth string
     * @return the header
     */
    public static Header createAuthHeader(String authString) {
        return new BasicHeader("Authorization", authString);
    }

    private static void addRequestHeaders(List<Header> headers, HttpRequestBase requestBase) {
        headers.forEach(h -> {
                    LOGGER.trace("Header: {}:{}", h.getName(), h.getValue());
                    requestBase.addHeader(h);
                });
    }

    private static <T> T mapResult(Class<T> classT, String result) throws IOException {
        if (result.isEmpty()) {
            return null;
        } else {
            return new ObjectMapper().readValue(result, classT);
        }
    }

}
