package com.experiments.tnpmanager.model;

import com.mongodb.internal.connection.Time;

public class Task {
    
    private Integer id;
    private String title;
    private String description;
    private Time time;
    private Integer status;
    
    private final Integer STATUS_INCOMPLETE = 0;
    private final Integer STATUS_COMPLETE = 1;

    //      TO BE UPDATED LATER
    // @Override
    // public String toString() {
    //     return "Task [id=" + id + ", title=" + title + ", description=" + description + ", time=" + time + "]";
    // }
    // public Task(Integer id, String title, String description, Time time) {
    //     this.id = id;
    //     this.title = title;
    //     this.description = description;
    //     this.time = time;
    // }
    public Task() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    
    
}
