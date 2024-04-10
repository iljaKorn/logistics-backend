package com.example.logisticsbackend.dto;

import com.example.logisticsbackend.entity.Trip;
import com.example.logisticsbackend.entity.TripStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class TripDTO {

    private Long id;
    private String departed;
    private String arrival;
    private String status;
    private Date createDate;
    private Date dapartedDate;
    private Date arrivalDate;
    private String client;
}
