package com.practice.springboot.demo.springbootpractice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayhello(){
        return "Hello World. It's nice to practice spring-boot.";
    }
    //expsoing a new endpoint for "/dev-tools" to check devtools
    @GetMapping("/devtool")
    public String devtool(){
        return "Dev-tools are working.";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Workout daily and rigorously";
    }

}
