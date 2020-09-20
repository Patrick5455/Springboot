package com.conferecne.service;

import com.conferecne.model.Speaker;
import com.conferecne.repo.SpeakerRepo;
import com.conferecne.repo.speakerRepoImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepo speakerRepo;

    public SpeakerRepo getSpeakerRepo() {
        return speakerRepo;
    }

    public void setSpeakerRepo(SpeakerRepo speakerRepo) {
        this.speakerRepo = speakerRepo;
    }

    public List<Speaker> findAll () {
        return speakerRepo.findAll();
    }


}
