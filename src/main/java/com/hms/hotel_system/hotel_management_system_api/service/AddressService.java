package com.hms.hotel_system.hotel_management_system_api.service;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestAddressDto;
import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestBranchDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseAddressDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseBranchDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.BranchPaginateResponseDto;

public interface AddressService {
    public void create(RequestAddressDto dto);

    public void update(RequestAddressDto dto, String addressId);

    public void delete(String addressId);

    public ResponseAddressDto findById(String addressId);

    public ResponseAddressDto findByBranchId(String branchId);
}
