package com.hms.hotel_system.hotel_management_system_api.service;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestAddressDto;
import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestRoomDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseAddressDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseRoomDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.RoomPaginateResponseDto;

public interface RoomService {
    public void create(RequestRoomDto dto);

    public void update(RequestRoomDto dto, String roomId);

    public void delete(String roomId);

    public ResponseRoomDto findById(String roomId);

    public RoomPaginateResponseDto findAll(int page, int size);
}
