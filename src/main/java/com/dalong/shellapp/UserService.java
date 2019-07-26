package com.dalong.shellapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class UserService {
    @GetMapping(value = "/info")
    public  Object printSysMetrics(){
        Map<String,String> metrics = new HashMap<>();
        metrics.put("os","mac");
        metrics.put("key", UUID.randomUUID().toString());
        return  metrics;
    }
}
