package com.example.DebitCopybook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @GetMapping("/ping")
    public String ping() {
        return "Borc Defteri Service is alive!";
    }
}
