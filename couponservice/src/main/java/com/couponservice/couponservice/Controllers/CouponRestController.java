package com.couponservice.couponservice.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.couponservice.couponservice.Model.Coupon;
import com.couponservice.couponservice.repos.couponRepo;


@RestController
@RequestMapping("/couponapi")
public class CouponRestController {

     @Autowired
     private couponRepo repo;
    
    @PostMapping("/coupons")
    public Coupon create(@RequestBody Coupon coupon){
        return repo.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
        return repo.findByCode(code);
    }
}
