package com.example.logisticsbackend.service;

import com.example.logisticsbackend.dto.AddTripDTO;
import com.example.logisticsbackend.dto.TripDTO;
import com.example.logisticsbackend.entity.Trip;
import com.example.logisticsbackend.entity.TripStatus;
import com.example.logisticsbackend.exception.AppError;
import com.example.logisticsbackend.repository.StatusRepository;
import com.example.logisticsbackend.repository.TripRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class TripService {
    private TripRepository tripRepository;
    private StatusRepository statusRepository;

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

    public void updateTrips(TripDTO dto) {
        TripStatus status = statusRepository.findByName(dto.getStatus()).orElseThrow();
        tripRepository.updateTrips(dto.getId(), dto.getDeparted(), dto.getArrival(), status,
                dto.getArrivalDate(), dto.getDapartedDate(), dto.getClient());
    }

    public void addTrip(AddTripDTO dto) {
        Trip newTrip = new Trip();
        newTrip.setDeparted(dto.getDeparted());
        newTrip.setArrival(dto.getArrived());
        newTrip.setStatus(statusRepository.findByName("Processing").get());
        newTrip.setCreateDate(new Date());
        newTrip.setDapartedDate(dto.getDepartedDate());
        newTrip.setArrivalDate(dto.getArrivedDate());
        newTrip.setClient(dto.getClient());

        tripRepository.save(newTrip);
    }

    public void deleteTrip(Long id) {
        tripRepository.deleteById(id);
    }
}
