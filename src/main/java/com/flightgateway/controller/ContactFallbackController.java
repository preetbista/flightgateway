package com.flightgateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactFallbackController {
    @GetMapping("/contactServiceFallback")
    public String contactfallback() {
        return "contactfallback";
    }
}
