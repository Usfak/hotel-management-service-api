package com.hms.hotel_system.hotel_management_system_api.service.impl;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestRoomDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseRoomDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.RoomPaginateResponseDto;
import com.hms.hotel_system.hotel_management_system_api.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    @Override
    public void create(RequestRoomDto dto) {

    }

    @Override
    public void update(RequestRoomDto dto, String roomId) {

    }

    @Override
    public void delete(String roomId) {

    }

    @Override
    public ResponseRoomDto findById(String roomId) {
        return null;
    }

    @Override
    public RoomPaginateResponseDto findAll(int page, int size) {
        return null;
    }
}
