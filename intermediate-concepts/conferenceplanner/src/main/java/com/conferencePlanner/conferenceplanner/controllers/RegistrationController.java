package com.conferencePlanner.conferenceplanner.controllers;

import com.conferencePlanner.conferenceplanner.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")
                                              Registration registration)
    {

        System.out.println("rE");
        return "registration";
    }

    @PostMapping("registration")
    //@Valid from hibernate-validator for validation
    public String addRegistration(@Valid @ModelAttribute("registration")
                                          Registration registration,
                                  // the binding result is used to
                                  // get any error signature passed by reference ad display it for us
                                  BindingResult result) {

        if (result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        }

        System.out.println("Registration: " + registration.getName());
        //Post-Redirect-Get Pattern
        // redirect to registration page
        return "redirect:registration";

    }





//    public String getRegistration(Map<String, Object> model){
//        model.put("message", "Register Here");
//        return "registration";
//    }
}
