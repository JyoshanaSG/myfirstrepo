package com.maven.springboot.springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {

	@RequestMapping("/")
    public String indexmyweb() {
        return "Hello from my controller";
    }
}
