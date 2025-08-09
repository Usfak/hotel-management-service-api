package com.hms.hotel_system.hotel_management_system_api.service;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestFacilityDto;
import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestRoomDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseFacilityDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseRoomDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.FacilityPaginateResponseDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.RoomPaginateResponseDto;

public interface FacilityService {
    public void create(RequestFacilityDto dto);

    public void update(RequestFacilityDto dto, String facilityId);

    public void delete(String facilityId);

    public ResponseFacilityDto findById(String facilityId);

    public FacilityPaginateResponseDto findAll(int page, int size);
}
