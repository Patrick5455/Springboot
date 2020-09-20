package com.conferecne.service;

import com.conferecne.model.Speaker;
import com.conferecne.repo.SpeakerRepo;
import com.conferecne.repo.speakerRepoImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    public SpeakerServiceImpl(){}

    // to be used for constructor bean dependency injection
    public SpeakerServiceImpl(SpeakerRepo speakerRepo){
        this.speakerRepo = speakerRepo;
    }

    private SpeakerRepo speakerRepo;


    // to be used for setter bean dependency injection
    public void setSpeakerRepo(SpeakerRepo speakerRepo) {
        this.speakerRepo = speakerRepo;
    }

    public List<Speaker> findAll () {
        return speakerRepo.findAll();
    }


}
