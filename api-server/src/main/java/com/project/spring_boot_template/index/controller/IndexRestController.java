package com.project.spring_boot_template.index.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@RestController
public class IndexRestController {
    @Value("${app.serverName}")
    private String serverName;
    
    @GetMapping("/")
    public String index() {
        return "Hello I'm " + serverName + "!";
    }
}
