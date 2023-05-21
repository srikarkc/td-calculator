package com.example.controller;

import com.example.model.ThermodynamicsData;
import com.example.service.ThermodynamicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/thermodynamics")
public class ThermodynamicsController {

    private final ThermodynamicsService thermodynamicsService;

    @Autowired
    public ThermodynamicsController(ThermodynamicsService thermodynamicsService) {
        this.thermodynamicsService = thermodynamicsService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<Double> calculate(@RequestBody ThermodynamicsData thermodynamicsData) {
        double result = thermodynamicsService.calculate(thermodynamicsData);
        return ResponseEntity.ok(result);
    }

}
