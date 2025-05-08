package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void punchTimeCard_shouldGoFromPunchedOutToIn() {
        //arrange
        Employee testEmployee = new Employee();
        //act
        testEmployee.punchTimeCard();
        //assert
        assertTrue(testEmployee.getPunchedIn());
    }

    @Test
    public void punchTimeCard_shouldGoFromPunchedInToOut() {
        //arrange
        Employee testEmployee = new Employee();
        testEmployee.setPunchedIn(true);
        //act
        testEmployee.punchTimeCard();
        //assert
        assertFalse(testEmployee.getPunchedIn());
    }

    @Test
    public void punchIn_IfAlreadyPunchedPunchInTimeWontChange() {
        //arrange
        Employee testEmployee = new Employee();
        testEmployee.punchIn(8.5);
        //act
        testEmployee.punchIn();
        //assert
        assertTrue(testEmployee.getPunchedIn());
        assertEquals(8.5, testEmployee.getPunchInTime());
    }

    public void punchIn_IfNotPunchedUpdatePunchTime(){
        //arrange
        Employee testEmployee = new Employee();
        //act
        testEmployee.punchIn(5.5);
        //assert
        assertTrue(testEmployee.getPunchedIn());
        assertEquals(5.5,testEmployee.getPunchInTime());
    }

    @Test
    public void punchOut_shouldAddToTotalHours(){
        //arrange
        Employee testEmployee = new Employee();
        testEmployee.setHoursWorked(5.0);
        testEmployee.punchIn(3.0);
        double expectedFinalHoursWorked = 9.0;
        //act
        testEmployee.punchOut(7.0);
        //assert
        assertTrue(testEmployee.getPunchedIn());
        assertEquals(expectedFinalHoursWorked, testEmployee.getHoursWorked());
    }
}