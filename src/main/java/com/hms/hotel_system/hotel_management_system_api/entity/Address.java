package com.hms.hotel_system.hotel_management_system_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="address")
public class Address {
    @Id
    @Column(name="adress_id",length=80)
    private String adressId;

    @Column(name="adress_line", nullable = false, length = 250)
    private String adressLine;

    @Column(name="city",nullable = false, length = 180)
    private String city;

    @Column(name="country",nullable = false,length = 100)
    private String country;

    @Column(name="longitude",nullable = false)
    private BigDecimal longitude;

    @Column(name="latitude")
    private BigDecimal latitude;

    @OneToOne
    @JoinColumn(name="branhc_id")
    private Branch branch;
}
