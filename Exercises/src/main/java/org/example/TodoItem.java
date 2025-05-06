package org.example;

import java.time.Duration;
import java.time.LocalDate;

public class TodoItem extends Note{

    //Specialized note that has deadline and completion status

    boolean isCompleted;
    LocalDate dueDate;
    String priority;

    void markAsCompleted(){

    }

    void updateDescription(String newDescription){

    }

    void updateTitle(String newTitle){

    }

    void setTimer(Duration duration){

    }

    void clearItem(){

    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
