package com.example.logisticsbackend.service;

import com.example.logisticsbackend.dto.TripDTO;
import com.example.logisticsbackend.entity.Trip;
import com.example.logisticsbackend.repository.TripRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TripService {
    private TripRepository tripRepository;

    public ResponseEntity<List<TripDTO>> getAll() {
        List<Trip> trips = tripRepository.findAll();
        List<TripDTO> newTrips = new ArrayList<>();
        for (int i = 0; i < trips.size(); i++) {
            Trip tr = trips.get(i);
            newTrips.add(new TripDTO(tr.getId(), tr.getDeparted(), tr.getArrival(), tr.getStatus().getName(),
                    tr.getCreateDate(), tr.getDapartedDate(), tr.getArrivalDate(), tr.getClient()));
        }
        return new ResponseEntity<>(newTrips, HttpStatus.OK);
    }
}
