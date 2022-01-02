package com.example.dynamicmultitenancy.mastertenant.service;

import com.example.dynamicmultitenancy.mastertenant.entity.MasterTenant;

public interface MasterTenantService {
    MasterTenant findByClientId(Integer clientId);
}
