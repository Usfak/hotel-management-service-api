package com.hms.hotel_system.hotel_management_system_api.service;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestFacilityDto;
import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestRoomImageDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseFacilityDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseRoomImageDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.FacilityPaginateResponseDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.RoomImagePaginateResponseDto;

public interface RoomImageService {
    public void create(RequestRoomImageDto dto);

    public void update(RequestRoomImageDto dto, String imageId);

    public void delete(String imageId);

    public ResponseRoomImageDto findById(String imageId);

    public RoomImagePaginateResponseDto findAll(int page, int size,string roomID);
}
