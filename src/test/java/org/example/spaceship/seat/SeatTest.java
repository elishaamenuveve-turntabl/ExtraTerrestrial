package org.example.spaceship.seat;

import org.example.Species;
import org.example.spaceship.seat.factory.SeatFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {
    Seat underTest;

    @Test
    void SeatCanBeBooked() {
        underTest = SeatFactory.INSTANCE.createSeat(Species.HUMAN, "Demo");
        Assertions.assertFalse(underTest.isBooked());
        underTest.book("Yay");
        Assertions.assertTrue(underTest.isBooked());
    }

    @Test
    void SeatsAreServedAppropriateMeals() {

       Seat human =  new HumanSeat("Demo");
       Seat martian = new MartianSeat("Demo");
       martian.book("Sam");
       human.book("Dea");

       human.serveMeal("pizza");
       martian.serveMeal("chicken");
    }

}