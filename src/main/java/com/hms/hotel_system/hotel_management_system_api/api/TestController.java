package com.hms.hotel_system.hotel_management_system_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http:localhost:8080/hotel-management/api/vi/test/check

@RestController
@RequestMapping("hotel-management/api/vi/test")
public class TestController {

    @GetMapping("/check")
    public String Test(){
        return "conected";
    }

}
