package com.hms.hotel_system.hotel_management_system_api.service.impl;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;
import com.hms.hotel_system.hotel_management_system_api.service.HotelService;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {
    @Override
    public void create(RequestHotelDto dto) {

    }

    @Override
    public void update(RequestHotelDto dto, String hotelId) {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }
}
