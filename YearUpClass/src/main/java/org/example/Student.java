package org.example;

public class Student extends Person {

    private String github;
    private String linkedIn;
    private String codingNickname;
    private String codeWarsXpoints;
    private String imageURL;
    private String deviceType; //Mac or Windwos
    private int pageNumberWorkbook;
    private String currentlyWorkingOn;

    public Student(String firstName, String lastName, String email, String gender, String github, String linkedin, String codingNickname,
                   String codeWarsXpoints, String imageurl, String device, int pageNumberWorkbook, String currentlyWorkingOn) {
        super(firstName, lastName, email, gender);

        this.github = github;
        this.codingNickname = codingNickname;
        this.codeWarsXpoints = codeWarsXpoints;
        this.linkedIn = linkedin;
        this.imageURL = imageURL;
        this.deviceType = device;
        this.pageNumberWorkbook = pageNumberWorkbook;
        this.currentlyWorkingOn = currentlyWorkingOn;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getCodingNickname() {
        return codingNickname;
    }

    public void setCodingNickname(String codingNickname) {
        this.codingNickname = codingNickname;
    }

    public String getCodeWarsXpoints() {
        return codeWarsXpoints;
    }

    public void setCodeWarsXpoints(String codeWarsXpoints) {
        this.codeWarsXpoints = codeWarsXpoints;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getPageNumberWorkbook() {
        return pageNumberWorkbook;
    }

    public void setPageNumberWorkbook(int pageNumberWorkbook) {
        this.pageNumberWorkbook = pageNumberWorkbook;
    }

    public String getCurrentlyWorkingOn() {
        return currentlyWorkingOn;
    }

    public void setCurrentlyWorkingOn(String currentlyWorkingOn) {
        this.currentlyWorkingOn = currentlyWorkingOn;
    }
}


