package com.couponservice.couponservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couponservice.couponservice.Model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
    
}
