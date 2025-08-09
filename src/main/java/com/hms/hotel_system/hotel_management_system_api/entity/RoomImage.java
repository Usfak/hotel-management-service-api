package com.hms.hotel_system.hotel_management_system_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="room_image")
public class RoomImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private FileFormatter fileFormatter;

    @ManyToOne()
    @JoinColumn(name="room_id")
    private Room room;

}
