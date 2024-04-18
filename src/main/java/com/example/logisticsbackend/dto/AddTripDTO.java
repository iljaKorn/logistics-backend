package com.example.logisticsbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class AddTripDTO {
    private String arrived;
    private String departed;
    private Date arrivedDate;
    private Date departedDate;
    private String client;
}
