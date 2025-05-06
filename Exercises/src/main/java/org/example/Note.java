package org.example;

import java.io.File;
import java.time.LocalDateTime;

public class Note {

    //A base class representing a general note or task-like item.

    private int id;
    private String title;
    private String content;
    private String subject;
    private LocalDateTime createdAt;

    public void inputUserNote(){

    }

    public void edit(String newContent){

    }

    public void delete(){

    }

    public void display(){

    }

    public void saveTo(File file){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
