package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repo.SpeakerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepo speakerRepo;


    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl No-Args Constructor");
    }

    // to be used for constructor bean dependency injection
    public SpeakerServiceImpl(SpeakerRepo speakerRepo){

        System.out.println("SpeakerServiceImpl Repository Constructor");

        this.speakerRepo = speakerRepo;
    }

    // to be used for setter bean dependency injection
    @Autowired
    public void setSpeakerRepo(SpeakerRepo speakerRepo) {

      // this would also be printed in the creation of instances of SpeakerServiceImpl
        // due to the @Autowired annotation

        System.out.println("SpeakerServiceImpl setter");

        this.speakerRepo = speakerRepo;
    }

    public List<Speaker> findAll () {

        return speakerRepo.findAll();
    }


}
