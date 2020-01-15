package com.laid.service.impl;

import com.laid.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

import java.time.LocalDate;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("[" + LocalDate.now() + "] Hello " + name );
        return "Hello " + name;
    }
}
