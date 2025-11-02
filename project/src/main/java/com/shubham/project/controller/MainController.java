package com.shubham.project.controller;

import com.shubham.project.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/aws")
@RestController
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }


    @GetMapping("/availability-zone")
    public String getAwsInfo() {
        return mainService.getAvailabilityZone();
    }
}
