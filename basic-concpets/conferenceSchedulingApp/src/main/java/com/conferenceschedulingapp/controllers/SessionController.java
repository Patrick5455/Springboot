package com.conferenceschedulingapp.controllers;

import com.conferenceschedulingapp.models.Session;
import com.conferenceschedulingapp.repositories.SessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

    @Autowired
    private SessionRepo sessionRepo;

    @GetMapping
    public List<Session> listSession(){
        return sessionRepo.findAll();
    }

    @GetMapping
    @RequestMapping("{id")
    public Session getSession(@PathVariable Long id){
        return sessionRepo.getOne(id);
    }

    @PostMapping
    public Session createSession(@RequestBody final Session session){
        return sessionRepo.saveAndFlush(session);
    }


}
