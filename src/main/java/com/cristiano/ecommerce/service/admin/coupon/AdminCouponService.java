package com.cristiano.ecommerce.service.admin.coupon;

import com.cristiano.ecommerce.entity.Coupon;

import java.util.List;

public interface AdminCouponService {

    Coupon createCoupon(Coupon coupon);
    List<Coupon> getAllCoupons();
}
