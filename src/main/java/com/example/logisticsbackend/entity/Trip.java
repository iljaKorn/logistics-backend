package com.example.logisticsbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@Table(name = "trips")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "departed")
    private String departed;
    @Column(name = "arrival")
    private String arrival;
    @ManyToOne
    @JoinColumn(name="status")
    private TripStatus status;
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "dapartedDate")
    private Date dapartedDate;
    @Column(name = "arrivalDate")
    private Date arrivalDate;
    @Column(name = "client")
    private String client;
}
