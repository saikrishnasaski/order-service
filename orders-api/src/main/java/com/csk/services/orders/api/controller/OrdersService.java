package com.csk.services.orders.api.controller;

import com.csk.services.business.logic.persistence.enums.OrderStatus;
import com.csk.services.business.logic.persistence.model.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
public class OrdersService {

    Order createOrder(Order order) {

        var randomOrderId = new Random().nextLong(8765432, 99999999);
        order.setOrderId(randomOrderId);
        order.setStatus(OrderStatus.PLACED);
        order.setCreatedAt(LocalDateTime.now());
        order.setUpdatedAt(LocalDateTime.now());

        return order;
    }
}
