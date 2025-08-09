package com.hms.hotel_system.hotel_management_system_api.dto.response.paginate;

import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseRoomDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomPaginateResponseDto {
    private List<ResponseRoomDto> datList;
    private long dataCount;
}
