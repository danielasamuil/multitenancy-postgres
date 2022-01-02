package com.example.dynamicmultitenancy.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LoginRequest {

    private String username;
    private String password;
    private Integer tenantOrClientId;
}