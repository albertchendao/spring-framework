package com.demo.service;

import org.springframework.stereotype.Service;

@Service("sayService")
public class SayServiceImpl implements SayService {

    @Override
    public void say(String name) {
        System.out.println("Saying " + name);
    }
}
