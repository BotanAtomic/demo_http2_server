package com.example.demo_http2_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/npcf-policyauthorization/v1/app-sessions")
    public String test() {
        return "successful";
    }

}
