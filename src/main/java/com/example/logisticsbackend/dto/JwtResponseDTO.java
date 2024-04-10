package com.example.logisticsbackend.dto;

import com.example.logisticsbackend.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponseDTO {
    private User user;
    private String token;
}
