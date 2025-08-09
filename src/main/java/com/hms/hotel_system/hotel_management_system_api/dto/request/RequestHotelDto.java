package com.hms.hotel_system.hotel_management_system_api.dto.request;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestHotelDto {
    private String description;
    private String hotelName;
    private int starRating;
    private BigDecimal startingFrom;

}
