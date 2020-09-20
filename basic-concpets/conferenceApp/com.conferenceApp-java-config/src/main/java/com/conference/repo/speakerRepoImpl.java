package com.conference.repo;

import com.conference.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepo")
public class speakerRepoImpl implements SpeakerRepo {

    public List<Speaker> findAll() {

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Patrick");
        speaker.setLastName("Ojunde");

        speakers.add(speaker);

        return speakers;
    }
}
