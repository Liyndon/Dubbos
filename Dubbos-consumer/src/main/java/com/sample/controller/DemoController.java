package com.sample.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sample.service.DemoService;
import org.springframework.http.ResponseEntity;

public class DemoController {


    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private DemoService demoService;

    public String demo() {
        demoService.demo();
        return ResponseEntity.ok().toString();
    }


}
