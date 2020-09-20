package com.conferecne.repo;

import com.conferecne.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class speakerRepoImpl implements SpeakerRepo {

    @Autowired
    private Calendar cal;

    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Patrick");
        speaker.setLastName("Ojunde");

        System.out.println("Cal: "+ cal.getTime());

        speakers.add(speaker);

        return speakers;
    }
}
