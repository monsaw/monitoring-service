package com.hommies.monitoringservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping
    public ResponseEntity<String> getRandomString(){
        return ResponseEntity.ok("Random Number " + System.currentTimeMillis());
    }
}
