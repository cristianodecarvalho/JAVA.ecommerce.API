package com.cristiano.ecommerce.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
public class CouponDto {

    private Long id;
    private String name;
    private String code;
    private Long discount;
    private Date expirationDate;
}
