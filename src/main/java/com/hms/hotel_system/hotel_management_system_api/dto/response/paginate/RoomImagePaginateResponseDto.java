package com.hms.hotel_system.hotel_management_system_api.dto.response.paginate;

import com.hms.hotel_system.hotel_management_system_api.dto.response.ResponseRoomImageDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImagePaginateResponseDto {
    private List<ResponseRoomImageDto> datList;
    private long dataCount;
}
