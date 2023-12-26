package com.csk.services.business.logic.persistence.enums;

public enum OrderStatus {

    PLACED("placed"), APPROVED("approved"), DELIVERED("delivered"), REJECTED("rejected");

    private String value;

    OrderStatus(String value) {

        this.value = value;
    }
}
