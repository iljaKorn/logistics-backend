package com.example.logisticsbackend.controller;

import com.example.logisticsbackend.service.TripService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class TripController {
    private TripService tripService;
    @GetMapping("/trips/all")
    public ResponseEntity<?> getAll() {
        return tripService.getAll();
    }
}
