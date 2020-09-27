package com.conferencePlanner.conferenceplanner.controllers;

import com.conferencePlanner.conferenceplanner.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")
                                              Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration")
                                          Registration registration){
        System.out.println("Registration: " +registration.getName());
        return "registration";
    }



//    public String getRegistration(Map<String, Object> model){
//        model.put("message", "Register Here");
//        return "registration";
//    }
}
