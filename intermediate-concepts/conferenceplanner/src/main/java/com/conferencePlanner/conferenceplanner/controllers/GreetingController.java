package com.conferencePlanner.conferenceplanner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Map;

@Controller
public class GreetingController {


    @GetMapping("greeting")
    public String greeting(Map<String, Object> model){
        model.put("message", "Hello Patrick");
                return "greeting";
    }

}
