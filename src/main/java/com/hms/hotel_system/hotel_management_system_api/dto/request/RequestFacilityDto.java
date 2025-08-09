package com.hms.hotel_system.hotel_management_system_api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestFacilityDto {
    private String name;
    private String roomId;

}
