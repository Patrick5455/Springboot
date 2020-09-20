package com.conferecne.service;

import com.conferecne.model.Speaker;
import com.conferecne.repo.SpeakerRepo;
import com.conferecne.repo.speakerRepoImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepo speakerRepo;


    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl NO-Args Constructor");
    }

    // to be used for constructor bean dependency injection
    public SpeakerServiceImpl(SpeakerRepo speakerRepo){

        System.out.println("SpeakerServiceImpl Repository Constructor");
        this.speakerRepo = speakerRepo;
    }

    // to be used for setter bean dependency injection
    public void setSpeakerRepo(SpeakerRepo speakerRepo) {
        this.speakerRepo = speakerRepo;
    }

    public List<Speaker> findAll () {
        return speakerRepo.findAll();
    }


}
