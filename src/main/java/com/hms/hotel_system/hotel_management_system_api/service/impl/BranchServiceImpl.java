package com.hms.hotel_system.hotel_management_system_api.service.impl;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestBranchDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseBranchDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.BranchPaginateResponseDto;
import com.hms.hotel_system.hotel_management_system_api.service.BranchService;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void create(RequestBranchDto dto) {

    }

    @Override
    public void update(RequestBranchDto dto, String branchId) {

    }

    @Override
    public void delete(String BranchId) {

    }

    @Override
    public ResponseBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText) {
        return null;
    }
}
