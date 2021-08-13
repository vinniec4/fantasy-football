package com.fantasy.app.controller;

import com.fantasy.app.service.SportRadarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SportRadarController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SportRadarController.class);

    private final SportRadarService sportRadarService;

    @Autowired
    public SportRadarController(SportRadarService sportRadarService) {
        this.sportRadarService = sportRadarService;
    }

    @GetMapping("/populateDatabase")
    public ResponseEntity<String> populateDatabase() {
        sportRadarService.populateDatabase();
        return ResponseEntity.ok("Populating Database");
    }

}
