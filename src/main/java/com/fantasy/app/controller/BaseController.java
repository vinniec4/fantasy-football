package com.fantasy.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    public UUID convertToUUID(String uuid) {
        UUID convertedId = null;
        try {
            convertedId = UUID.fromString(uuid);
        } catch (Exception e) {
            LOGGER.info("ID: {} cannot be found", uuid, e);
        }
        return convertedId;
    }
}
