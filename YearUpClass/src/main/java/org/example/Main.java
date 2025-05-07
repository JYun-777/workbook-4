package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a generic person
        Person person = new Person("Jane", "Doe", "jane.doe@example.com", "female");

        // Print information about the person
        System.out.println("Person:");
        System.out.println("Full Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Gender: " + person.getGender());
        System.out.println(); // line break

        //Add the student with your own details
        Student student = new Student(
                "Jonathan",                            // First name
                "Yun",                      // Last name
                "jonathanwyun@gmail.com",              // Email
                "male",                             // Gender
                "https://github.com/JYun-777",  // GitHub link
                "https://www.linkedin.com/in/jonathan-w-yun/", // LinkedIn profile
                "Jon Y",                    // Coding nickname
                "0",                                // Codewars XP (as String)
                "https://avatars.githubusercontent.com/u/206603354?v=4",      // Image URL
                "Windows",                          // Device type
                50,                                  // Workbook page number
                "Extending Classes"                                // Currently working on (page/task)
        );

        // Print information about the student
        System.out.println("Student:");
        System.out.println("Full Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Github: " + student.getGithub());
        System.out.println("LinkedIn: " + student.getLinkedIn());
        System.out.println("Nickname: " + student.getCodingNickname());
        System.out.println("Codewars XP: " + student.getCodeWarsXpoints());
        System.out.println("Avatar: " + student.getImageURL());
        System.out.println("Device: " + student.getDeviceType());
        System.out.println("Workbook Page: " + student.getPageNumberWorkbook());
        System.out.println("Current project: " + student.getCurrentlyWorkingOn());
        System.out.println(); // line break

    }
}