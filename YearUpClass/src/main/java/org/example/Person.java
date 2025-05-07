package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;

    //Parameterless Constructor
    public Person(){

    }

    // Constructor
    public Person(String firstName, String lastName, String email, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    // Getters en Setters
    public String getName() { return firstName + " " + lastName;}
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setEmail(String email) { this.email = email; }
    public void setGender(String gender) { this.gender = gender; }
}