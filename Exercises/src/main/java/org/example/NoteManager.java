package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NoteManager {

    //Manages both notes and todos in unified collections.

    ArrayList<Note> notes;

    ArrayList<TodoItem> todos;

    ArrayList<Note> history;

    int idCount = 0;


    void addNote(Note note){

    }

    void deleteNote(int id){

    }

    void editNote(int id, String newContent){

    }

    void displayAllNotes(){

    }

    void sortNotes(Comparator<Note>){

    }

    List<Note> search(String keyword){

    }

    List<Note> filterBySubject(String subject){

    }

    List<Note> filterByDate(LocalDate date){

    }
}
