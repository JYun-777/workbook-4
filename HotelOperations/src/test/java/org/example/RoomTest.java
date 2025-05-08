package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_shouldFailIfRoomIsDirty(){
        //arrange
        Room testRoom = new Room();
        testRoom.setDirty(true);
        //act
        testRoom.checkIn("Jojo");
        //assert
        assertFalse(testRoom.getOccupied());
    }

    @Test
    public void checkIn_shouldFailIfRoomIsOccupied(){
        //arrange
        Room testRoom = new Room();
        testRoom.checkIn("Jojo");

        //act
        testRoom.checkIn("Dio");
        //assert
        assertEquals("Jojo", testRoom.getGuestName());
    }

    @Test
    public void checkIn_shouldMakeRoomOccupiedAndUnavailable(){
        //arrange
        Room testRoom = new Room();
        //act
        testRoom.checkIn("Jojo");
        //assert
        assertFalse(testRoom.getAvailable(), "Room checkin failed");
        assertTrue(testRoom.getOccupied(), "Room checkin failed");
        assertTrue(testRoom.getDirty());
    }

    @Test
    public void checkOut_shouldClearRoomAndMakeDirty(){
        //arrange
        Room testRoom = new Room();
        //act
        testRoom.checkOut();
        //assert
        assertFalse(testRoom.getOccupied(), "Room checkout failed");
        assertTrue(testRoom.getDirty(), "Room checkout failed");//room should be marked as dirty after checking out
    }

    @Test
    public void cleanRoom_shouldMakeRoomNotDirtyAndMarkItAsAvailable(){
        //arrange
        Room testRoom = new Room();
        testRoom.setDirty(true);
        //act
        testRoom.cleanRoom();
        //assert
        assertTrue(testRoom.getAvailable(), "Room cleaning failed");
        assertFalse(testRoom.getDirty(), "Room cleaning failed");
    }

    @Test
    public void cleanRoom_shouldFailIfRoomIsOccupied(){
        //arrange
        Room testRoom = new Room();
        testRoom.setOccupied(true);
        testRoom.setDirty(true);
        //act
        testRoom.cleanRoom();
        //assert
        assertTrue(testRoom.getDirty());

    }
}