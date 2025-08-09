package com.hms.hotel_system.hotel_management_system_api.dto.response.paginate;

import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseAddressDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressPaginateResponseDto {
    private List<ResponseAddressDto> datList;
    private long dataCount;
}
