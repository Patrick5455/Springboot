package com.conferecne.repo;

import com.conferecne.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class speakerRepoImpl implements SpeakerRepo {

    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Patrick");
        speaker.setLastName("Ojunde");

        speakers.add(speaker);

        return speakers;
    }
}
