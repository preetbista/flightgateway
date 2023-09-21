package com.flightgateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PassengerFallbackController {

    @GetMapping("/passengerServiceFallback")
    public String passengerfallback() {
        return "passengerfallback";
    }
}
