package com.csk.services.business.logic.persistence.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {

    private String street;
    private String city;
    private String country;
    private String zip;
}
