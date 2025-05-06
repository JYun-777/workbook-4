package org.example;

import java.time.LocalDateTime;

public class Employee {

    private static Boolean isPunchedIn = false;
    private static Double hoursWorked = 0.0;
    private String jobRole = "default";

    public static void punchTimeCard(double timePunch){
        if(isPunchedIn){
            isPunchedIn = false;
        }else {
            isPunchedIn = true;
        }
    }

    public static void punchIn(){
        double hour = (double) LocalDateTime.now().getHour();
        double minute = ((double) LocalDateTime.now().getMinute()/60)/100;

        double timePunch = hour + minute;
    }

    public static void punchIn(double timePunch){

    }

    public static void punchOut(){

    }

    public static void punchOut(double timePunch) {

    }

}
