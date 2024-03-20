package com.cristiano.ecommerce.service.admin.adminorder;

import com.cristiano.ecommerce.dto.AnalyticsResponse;
import com.cristiano.ecommerce.dto.OrderDto;

import java.util.List;

public interface AdminOrderService {

    List<OrderDto> getAllPlacedOrders();
    OrderDto changeOrderStatus(Long orderId, String status);
    AnalyticsResponse calculateAnalytics();
}
