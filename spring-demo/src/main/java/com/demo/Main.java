package com.demo;

import com.demo.configuration.AppConfig;
import com.demo.service.SayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SayService testService = context.getBean(SayService.class);
        testService.say("Hello World");
    }
}