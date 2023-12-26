package com.csk.services.business.logic.persistence.model;

import com.csk.services.business.logic.persistence.enums.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Order {

    private long orderId;
    private long customerId;
    private List<Product> products;
    private double totalPrice;
    private OrderStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
