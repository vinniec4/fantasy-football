package com.fantasy.app.controller;

import com.fantasy.app.service.ESPNService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ESPNController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ESPNController.class);

    private final ESPNService espnService;

    @Autowired
    public ESPNController(ESPNService espnService) {
        this.espnService = espnService;
    }

    @GetMapping("/populateDatabase")
    public ResponseEntity<String> populateDatabase() {
        espnService.populateDatabase();
        return ResponseEntity.ok("Populating Database");
    }

}
