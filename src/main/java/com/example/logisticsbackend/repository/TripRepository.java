package com.example.logisticsbackend.repository;

import com.example.logisticsbackend.entity.Trip;
import com.example.logisticsbackend.entity.TripStatus;
import com.example.logisticsbackend.entity.User;
import jakarta.transaction.Transactional;
import lombok.Data;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {
    List<Trip> findAll();
    @Transactional
    @Modifying
    @Query("UPDATE Trip tr SET tr.arrival = :arrival," +
            "tr.arrivalDate = :arrivalDate," +
            "tr.departed = :departed," +
            "tr.dapartedDate = :dapartedDate," +
            "tr.client = :client," +
            "tr.status = :status WHERE tr.id = :id")
    void updateTrips(@Param("id") Long tripId, @Param("arrival") String arrival, @Param("departed") String departed,
                     @Param("status") TripStatus status, @Param("arrivalDate") Date arrivalDate,
                     @Param("dapartedDate") Date dapartedDate, @Param("client") String client);
}
