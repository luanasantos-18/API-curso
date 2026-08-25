package com.eventostec.api.controller;

import com.eventostec.api.domain.eventos.Event;
import com.eventostec.api.domain.eventos.EventRequestDTO;
import com.eventostec.api.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventservice;

    @PostMapping
    public ResponseEntity<Event> create(@RequestBody EventRequestDTO body){
        Event newEvent = this.eventservice.createEvent(body);
        return ResponseEntity.ok(newEvent);
    }
}
