package com.hms.hotel_system.hotel_management_system_api.service;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;

import java.sql.SQLException;

public interface HotelService {
    public void create(RequestHotelDto dto);
    public void update(RequestHotelDto dto,String hotelId) throws SQLException;
    public void delete(String hotelId);
    public ResponseHotelDto findById(String  hotelId);
    public HotelPaginateResponseDto findAll(int page, int size, String searchText);

}
