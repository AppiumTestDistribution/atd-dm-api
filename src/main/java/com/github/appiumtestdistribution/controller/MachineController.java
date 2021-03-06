package com.github.appiumtestdistribution.controller;

import com.github.appiumtestdistribution.helpers.Helpers;
import com.github.appiumtestdistribution.modal.XcodeResponse;
import com.github.appiumtestdistribution.service.XcodeService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MachineController {

    @Autowired
    private XcodeService xcodeService;

    @SneakyThrows
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/machine/xcodeVersion")
    public XcodeResponse getXcodeVersion(){
        return xcodeService.getXcodeDetails();
    }

    @SneakyThrows
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/machine/availablePort")
    public int getAvailablePort(){
        return Helpers.getAvailablePort();
    }
}
