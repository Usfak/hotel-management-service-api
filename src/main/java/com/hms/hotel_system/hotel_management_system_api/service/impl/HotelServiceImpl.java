package com.hms.hotel_system.hotel_management_system_api.service.impl;

import com.hms.hotel_system.hotel_management_system_api.dto.request.RequestHotelDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseBranchDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseHotelDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.paginate.HotelPaginateResponseDto;
import com.hms.hotel_system.hotel_management_system_api.entity.Branch;
import com.hms.hotel_system.hotel_management_system_api.entity.Hotel;
import com.hms.hotel_system.hotel_management_system_api.exception.EntryNotFoundException;
import com.hms.hotel_system.hotel_management_system_api.repo.HotelRepo;
import com.hms.hotel_system.hotel_management_system_api.service.HotelService;
import com.hms.hotel_system.hotel_management_system_api.util.ByteCodeHandler;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;

    @Override
    public void create(RequestHotelDto dto) {
        try {
            hotelRepo.save(toHotel(dto));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(RequestHotelDto dto, String hotelId) throws SQLException {
         Hotel selectedHotel = hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel not found!"));
         selectedHotel.setHotelName(dto.getHotelName());
         selectedHotel.setUpdatedAt(LocalDateTime.now());
         selectedHotel.setDescription(byteCodeHandler.stringtoBlob(dto.getDescription()));
         selectedHotel.setStartingFrom(dto.getStartingFrom());
         selectedHotel.setStarRating(dto.getStarRating());
         hotelRepo.save(selectedHotel);
    }

    @Override
    public void delete(String hotelId) {
        hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel not found!"));
        hotelRepo.deleteById(hotelId);

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
        return null;
    }

    private Hotel toHotel(RequestHotelDto dto) throws SQLException {
        return dto == null ? null :
                Hotel.builder()
                        .hotelName(dto.getHotelName())
                        .hotelId(UUID.randomUUID().toString())
                        .starRating(dto.getStarRating())
                        .description(byteCodeHandler.stringtoBlob(dto.getDescription()))
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .activeStatus(true)
                        .startingFrom(dto.getStartingFrom())
                        .build();
    }

    private ResponseHotelDto toResponseHotel(Hotel hotel) throws SQLException {
        return hotel == null ? null :
                ResponseHotelDto.builder()
                        .hotelId(hotel.getHotelId())
                        .hotelName(hotel.getHotelName())
                        .activeStatus(hotel.isActiveStatus())
                        .starRating(hotel.getStarRating())
                        .updatedAt(LocalDateTime.now())
                        .createdAt(LocalDateTime.now())
                        .description(byteCodeHandler.blobtoString(hotel.getDescription()))
                        .branches(
                                hotel.getBranches().stream().map( e-> {
                                    try {
                                        return toResponseBranchDto(e);
                                    } catch (SQLException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                }).toList()
                        )
                        .build();
    }
    private ResponseBranchDto toResponseBranchDto(Branch branch) throws SQLException {
        return branch==null?null:
                ResponseBranchDto.builder()
                        .branchId(branch.getBranchId())
                        .branchName(branch.getBranchName())
                        .roomCount(branch.getRoomCount())
                        .branchType(branch.getBranchType())
                        .build();
    }
}