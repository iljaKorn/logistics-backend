package com.example.logisticsbackend.controller;

import com.example.logisticsbackend.dto.AddTripDTO;
import com.example.logisticsbackend.dto.TripDTO;
import com.example.logisticsbackend.service.TripService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
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
    @PostMapping("/trips/add")
    public void addTrip(@RequestBody AddTripDTO dto){
        tripService.addTrip(dto);
    }
    @DeleteMapping("/trips/delete/{id}")
    public void deleteTrip(@PathVariable Long id){
        tripService.deleteTrip(id);
    }
}
