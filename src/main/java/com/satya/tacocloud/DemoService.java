package com.satya.tacocloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoService {

    public String getWelcomeMessage(String name){
        log.info("Name is {}", name);
        return "Welcome "+name;
    }
}
