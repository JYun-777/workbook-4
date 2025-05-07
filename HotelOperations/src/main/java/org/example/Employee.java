package org.example;

import java.time.LocalDateTime;

public class Employee {

    private String name;
    private Boolean isPunchedIn = false;
    private double punchInTime;
    private double punchOutTime;
    private double hoursWorked = 0.0;
    private double payRate;
    private String employeeID;
    private String department = "default";

    public void punchTimeCard(){
        punchTimeCard(timeToDouble(LocalDateTime.now()));
    }

    public void punchTimeCard(double _timePunch){
        if(isPunchedIn){
            this.punchOutTime = _timePunch;
            isPunchedIn = false;
        }else {
            this.punchInTime = _timePunch;
            isPunchedIn = true;
        }
    }

    public void punchIn(){
        punchIn(timeToDouble(LocalDateTime.now()));
    }

    public void punchIn(double _timePunch){
        if(!this.isPunchedIn) {
            this.punchInTime = _timePunch;
            this.isPunchedIn = true;
        }
    }

    public void punchOut(){
        punchOut(timeToDouble(LocalDateTime.now()));
    }

    public void punchOut(double _timePunch) {
        this.punchOutTime = _timePunch;
        this.hoursWorked += this.punchOutTime - this.punchInTime;
    }

    public void getTotalPay(){

    }

    public void getRegularHours(){

    }

    public void getOvertimeHours(){

    }

    public Boolean getPunchedIn() {
        return this.isPunchedIn;
    }

    public void setPunchedIn(Boolean punchedIn) {
        this.isPunchedIn = punchedIn;
    }

    public double getPunchInTime() {
        return punchInTime;
    }

    public void setPunchInTime(double punchInTime) {
        this.punchInTime = punchInTime;
    }

    public double getPunchOutTime() {
        return punchOutTime;
    }

    public void setPunchOutTime(double punchOutTime) {
        this.punchOutTime = punchOutTime;
    }

    public static double timeToDouble(LocalDateTime _time) {
        double hour = (double)(_time.getHour());
        double fractionOfHour = ((double) _time.getMinute())/60.0;
        double combineDoubleTime = hour + fractionOfHour;
        double roundedDoubleTime = Math.round(combineDoubleTime * 100.0)/100.0;
        return roundedDoubleTime;
    }

}
