package com.hms.hotel_system.hotel_management_system_api.service.impl;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestAddressDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseAddressDto;
import com.hms.hotel_system.hotel_management_system_api.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public void create(RequestAddressDto dto) {

    }

    @Override
    public void update(RequestAddressDto dto, String addressId) {

    }

    @Override
    public void delete(String addressId) {

    }

    @Override
    public ResponseAddressDto findById(String addressId) {
        return null;
    }

    @Override
    public ResponseAddressDto findByBranchId(String branchId) {
        return null;
    }
}
