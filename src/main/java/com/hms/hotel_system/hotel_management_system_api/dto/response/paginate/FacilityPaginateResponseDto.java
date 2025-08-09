package com.hms.hotel_system.hotel_management_system_api.dto.response.paginate;

import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseFacilityDto;
import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseRoomDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacilityPaginateResponseDto {
    private List<ResponseFacilityDto> datList;
    private long dataCount;
}
