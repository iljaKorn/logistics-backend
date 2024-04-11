package com.example.logisticsbackend.controller;

import com.example.logisticsbackend.dto.TripDTO;
import com.example.logisticsbackend.service.TripService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class TripController {
    private TripService tripService;
    @GetMapping("/trips/all")
    public ResponseEntity<?> getAll() {
        return tripService.getAll();
    }
    @PutMapping("/trips/change_rows")
    public void changeRows(@RequestBody TripDTO dto){
        tripService.updateTrips(dto);
    }
}
