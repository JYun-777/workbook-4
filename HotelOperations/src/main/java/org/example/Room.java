package org.example;

public class Room {

    private final int roomNumber = 0;
    private String guestName = null;
    private double price;
    private int numberOfBeds;
    private Boolean isOccupied = false;
    private Boolean isAvailable = true;
    private Boolean isDirty = false;

    public void checkIn(){
        if (this.isAvailable && !this.isOccupied && !this.isDirty){
            //this.guestName();
            this.isOccupied = true;
            this.isAvailable = false;
        }
    }

    public void checkOut(){
        this.isOccupied = false;
        this.isAvailable = true;
        this.isDirty = true;
    }

    public void sendRequest(){

    }

    public void cleanRoom(){
        this.isDirty = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Boolean getDirty() {
        return isDirty;
    }

    public void setDirty(Boolean dirty) {
        isDirty = dirty;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}
