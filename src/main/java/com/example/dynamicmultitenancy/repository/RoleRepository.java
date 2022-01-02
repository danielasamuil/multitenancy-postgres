package com.example.dynamicmultitenancy.repository;

import com.example.dynamicmultitenancy.model.ERole;
import com.example.dynamicmultitenancy.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole role);
}
