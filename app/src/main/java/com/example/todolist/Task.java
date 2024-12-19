package com.example.todolist;



public class Task {
    private int id;
    private String title;
    private String description;
    private String state;
    private long timestamp;

    public Task(int id, String title, String description, String state, long timestamp) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.state = state;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getState() { return state; }
    public long getTimestamp() { return timestamp; }

    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setState(String state) { this.state = state; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }
}
