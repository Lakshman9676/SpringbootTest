package com.example.SpringbootTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello from Azure DevOps";
    }
}
