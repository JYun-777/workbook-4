package org.example;

public class Main {
    public static void main(String[] args) {
        NoteManager nm = new NoteManager();
        Note newNote = new Note();
        newNote.setContent("Hello World");
        nm.addNote(newNote);


    }
}