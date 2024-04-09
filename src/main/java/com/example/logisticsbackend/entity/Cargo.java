package com.example.logisticsbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cargos")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "weight")
    private String weight;
    @Column(name = "height")
    private String height;
    @Column(name = "length")
    private String length;
    @Column(name = "width")
    private String width;
    @ManyToOne
    @JoinColumn(name="trip")
    private Trip trip;
}
