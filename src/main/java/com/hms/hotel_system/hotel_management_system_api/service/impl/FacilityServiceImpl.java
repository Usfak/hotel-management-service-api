package com.hms.hotel_system.hotel_management_system_api.service.impl;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestFacilityDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseFacilityDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.FacilityPaginateResponseDto;
import com.hms.hotel_system.hotel_management_system_api.service.FacilityService;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Override
    public void create(RequestFacilityDto dto) {

    }

    @Override
    public void update(RequestFacilityDto dto, String facilityId) {

    }

    @Override
    public void delete(String facilityId) {

    }

    @Override
    public ResponseFacilityDto findById(String facilityId) {
        return null;
    }

    @Override
    public FacilityPaginateResponseDto findAll(int page, int size) {
        return null;
    }
}
