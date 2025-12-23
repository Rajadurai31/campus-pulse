package com.example.campus_pulse.model;
import com.example.campus_pulse.model.enums.ContestPlatform;
import java.time.LocalDateTime;

public class Contest {

    private Long id;
    private String title;
    private ContestPlatform platform;
    private LocalDateTime contestDate;
    private int duration; // minutes
    private String link;

    public Contest() {}

    public Contest(Long id, String title, ContestPlatform platform,
                   LocalDateTime contestDate, int duration, String link) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.contestDate = contestDate;
        this.duration = duration;
        this.link = link;
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

    public ContestPlatform getPlatform() {
        return platform;
    }

    public void setPlatform(ContestPlatform platform) {
        this.platform = platform;
    }

    public LocalDateTime getContestDate() {
        return contestDate;
    }

    public void setContestDate(LocalDateTime contestDate) {
        this.contestDate = contestDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
