package com.conferenceschedulingapp.repo;

import com.conferenceschedulingapp.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepo extends JpaRepository <Speaker, Long> {
}
