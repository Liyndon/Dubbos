package com.sample.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sample.service.DemoService;
import org.springframework.stereotype.Component;

@Component
@Service(
        version = "1.0.0",
        interfaceClass = DemoService.class
)
public class DemoServiceImpl implements DemoService {
    public String demo() {
        return null;
    }
}
