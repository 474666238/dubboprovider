package com.laid;

import com.laid.service.DemoService;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.laid"})
@DubboComponentScan(basePackages = {"com.laid.service"})
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(com.laid.Main.class);
        DemoService demoService = ctx.getBean(DemoService.class);
        System.out.println(demoService);
    }
}


