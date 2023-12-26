package com.csk.services.business.logic.persistence.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Customer {

    private long customerId;
    private String userName;
    private long phone;
    private Address address;
}
