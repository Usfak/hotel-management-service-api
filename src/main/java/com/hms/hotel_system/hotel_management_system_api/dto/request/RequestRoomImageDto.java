package com.hms.hotel_system.hotel_management_system_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRoomImageDto {
    private MultipartFile file;
    private String roomId;

}
