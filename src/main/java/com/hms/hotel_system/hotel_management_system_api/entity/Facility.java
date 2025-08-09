package com.hms.hotel_system.hotel_management_system_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name",nullable = false,length=100)
    private String name;

    @ManyToOne()
    @JoinColumn(name="room_id")
    private Room room;
}
