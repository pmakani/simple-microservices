package com.qlogic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserRestController {

    @GetMapping
    ResponseEntity<String> getUser() {
        return ResponseEntity.ok("Testing");
    }
}
