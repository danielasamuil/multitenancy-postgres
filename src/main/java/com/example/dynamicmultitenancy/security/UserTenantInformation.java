package com.example.dynamicmultitenancy.security;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserTenantInformation {

    private Map<String, String> map = new HashMap<>();
}
