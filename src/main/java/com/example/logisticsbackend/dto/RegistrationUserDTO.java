package com.example.logisticsbackend.dto;

import lombok.Data;

@Data
public class RegistrationUserDTO {
    private String username;
    private String password;
    private String email;
}
