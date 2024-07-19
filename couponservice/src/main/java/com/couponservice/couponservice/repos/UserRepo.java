package com.couponservice.couponservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couponservice.couponservice.Model.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
