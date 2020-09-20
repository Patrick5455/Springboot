package com.conference.service;

import com.conference.model.Speaker;
import com.conference.repo.SpeakerRepo;


import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepo speakerRepo;

    public void setSpeakerRepo(SpeakerRepo speakerRepo) {
        this.speakerRepo = speakerRepo;
    }

    public List<Speaker> findAll () {
        return speakerRepo.findAll();
    }

}
