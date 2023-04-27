package org.example.spaceship.seat;

import org.example.Species;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    Seat underTest;

    @Test
    void SeatCanBeBooked() {
        underTest = new Seat(Species.HUMAN, "Demo");
        Assertions.assertFalse(underTest.isBooked());
        underTest.book("Yay");
        Assertions.assertTrue(underTest.isBooked());
    }

}