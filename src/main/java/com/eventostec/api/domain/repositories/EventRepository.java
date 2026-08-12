package com.eventostec.api.domain.repositories;

import com.eventostec.api.domain.eventos.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}

