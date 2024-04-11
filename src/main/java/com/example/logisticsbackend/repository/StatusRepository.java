package com.example.logisticsbackend.repository;

import com.example.logisticsbackend.entity.Trip;
import com.example.logisticsbackend.entity.TripStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatusRepository extends CrudRepository<TripStatus, Long> {
    Optional<TripStatus> findByName(String name);
}
