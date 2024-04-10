package com.practice.springboot.demo.springbootpractice.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayhello(){
        return "Hello World. It's nice to practice spring-boot.";
    }
    //exposing a new endpoint for "/dev-tools" to check devtools
    @GetMapping("/devtool")
    public String devtool(){
        return "Dev-tools are working.";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Workout daily and rigorously";
    }

    //injecting custom properties for practice.name and practice.status
    @Value("${practice.app}")
    private String practiceApp;

    @Value("${practice.status}")
    private String practiceStatus;

    //exposing new endpoint for appstatus
    @GetMapping("/appstatus")
    public String getAppStatus(){
        return "Name: " + practiceApp + ". Status: " +practiceStatus;
    }

}
