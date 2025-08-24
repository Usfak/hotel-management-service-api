package com.hms.hotel_system.hotel_management_system_api.repo;

import com.hms.hotel_system.hotel_management_system_api.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,String> {
}
