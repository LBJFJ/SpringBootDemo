package com.webapp.lbj.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // http://localhost:8080/hello
    @RequestMapping("/hello")
    public String index() {
        return "Hello World!";
    }
    
    // http://localhost:8080/hello/test
    @RequestMapping("/hello/test")
    public String indexFor() {
        return "Hello World, I am test!";
    }
}
