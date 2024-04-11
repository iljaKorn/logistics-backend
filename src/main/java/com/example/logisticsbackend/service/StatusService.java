package com.example.logisticsbackend.service;

import com.example.logisticsbackend.entity.TripStatus;
import com.example.logisticsbackend.repository.StatusRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StatusService {
    private StatusRepository statusRepository;

    public TripStatus getStatusByName(String name){
        return statusRepository.findByName(name).get();
    }
}
