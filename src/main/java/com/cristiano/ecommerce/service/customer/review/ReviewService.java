package com.cristiano.ecommerce.service.customer.review;

import com.cristiano.ecommerce.dto.OrderedProductsResponseDto;
import com.cristiano.ecommerce.dto.ReviewDto;

import java.io.IOException;

public interface ReviewService {

    OrderedProductsResponseDto getOrderedProductsDetailsByOrderId(Long orderId);
    ReviewDto giveReview(ReviewDto reviewDto) throws IOException;
}
