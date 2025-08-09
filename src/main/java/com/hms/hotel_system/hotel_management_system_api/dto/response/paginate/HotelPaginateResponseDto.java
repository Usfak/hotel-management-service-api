package com.hms.hotel_system.hotel_management_system_api.dto.response.paginate;

import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseHotelDto;

import java.util.List;

public class HotelPaginateResponseDto {
    private List<ResponseHotelDto> datList;
    private long dataCount;
}
