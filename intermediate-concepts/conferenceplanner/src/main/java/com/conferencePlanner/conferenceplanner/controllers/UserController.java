package com.conferencePlanner.conferenceplanner.controllers;

import com.conferencePlanner.conferenceplanner.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(
            @RequestParam(
                    value = "firstname", defaultValue = "Patrick") String firstname,
            @RequestParam(
                    value = "lastname", defaultValue = "Ojunde") String lastName,
            @RequestParam(
                    value = "age", defaultValue = "45") Integer age
                        )
    {

        User user = new User();
        user.setFirstName(firstname);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }
}
