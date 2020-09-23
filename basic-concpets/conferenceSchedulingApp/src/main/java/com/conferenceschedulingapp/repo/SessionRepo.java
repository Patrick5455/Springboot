package com.conferenceschedulingapp.repo;

import com.conferenceschedulingapp.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepo extends JpaRepository <Session, Long> {

}
