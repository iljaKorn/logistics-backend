package com.example.logisticsbackend.repository;

import com.example.logisticsbackend.entity.Trip;
import com.example.logisticsbackend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {

    List<Trip> findAll();
}
