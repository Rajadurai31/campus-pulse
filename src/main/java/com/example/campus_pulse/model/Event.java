package com.example.campus_pulse.model;
import com.example.campus_pulse.model.enums.EventType;
import java.time.LocalDate;

public class Event {

    private Long id;
    private String title;
    private String description;
    private EventType eventType;
    private LocalDate eventDate;
    private String location;

    // Constructors
    public Event() {}

    public Event(Long id, String title, String description,
                 EventType eventType, LocalDate eventDate, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.location = location;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getEventType() {
        return eventType;
    }
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
