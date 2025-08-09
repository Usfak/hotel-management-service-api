package com.hms.hotel_system.hotel_management_system_api.dto.response;

import lombok.*;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseAddressDto {
    private String addressLine;
    private String city;
    private String Country;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String branchId;
}
