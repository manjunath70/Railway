package com.example.testprofile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/get")
    String getString() {
        return "Hello";
    }
}
