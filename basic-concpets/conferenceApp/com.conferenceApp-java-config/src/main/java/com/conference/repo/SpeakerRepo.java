package com.conference.repo;

import com.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepo {

    public List<Speaker> findAll();
}
