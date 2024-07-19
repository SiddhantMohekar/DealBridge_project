package com.couponservice.couponservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.couponservice.couponservice.Model.Coupon;

public interface couponRepo extends JpaRepository<Coupon, Long> {
    Coupon findByCode(String code);
}
