package org.example.spaceship;

import org.example.Species;
import org.example.organism.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

class SpaceshipTest {
    Spaceship underTest;

    @BeforeEach
    void setup() {
        underTest = new Spaceship(Map.of(Species.HUMAN, 5, Species.MARTIAN, 5));
    }


    @Test
    void SeatsGeneratedAreAsSpecified() {
        //arrange
        int sizeMartian = 11, sizeHuman = 3;

        underTest = new Spaceship(Map.of(Species.HUMAN, sizeHuman, Species.MARTIAN, sizeMartian));
        //act
        //assert
        Assertions.assertEquals(sizeHuman, underTest.getSeats().get(Species.HUMAN).size());
        Assertions.assertEquals(sizeMartian, underTest.getSeats().get((Species.MARTIAN)).size());
    }

    @Test
    void CanBookSeat() {
        Assertions.assertTrue(underTest.bookSeat(Species.MARTIAN, "Ma Fhalek"));
    }

    @Test
    void CannotBookWhenAllSeatsAreBooked() {
        //arrange
        int sizeHuman = 1;
        Human human = new Human("John"), superHuman = new Human("Clark");

        underTest = new Spaceship(Map.of(Species.HUMAN, sizeHuman));
        //act
        //assert
        Assertions.assertTrue(underTest.bookSeat(human.getSpecies(),human.getName()));
        Assertions.assertFalse(underTest.bookSeat(superHuman.getSpecies(),superHuman.getName()));
        Assertions.assertEquals("John",underTest.getSeats().get(Species.HUMAN).get(0).getNameOfPersonBooking());
    }

    @Test
    void CannotBookSeatFromOtherSpecies () {
        //arrange
        int sizeMartian = 1;
        Human superHuman = new Human("Clark");

        underTest = new Spaceship(Map.of(Species.MARTIAN, sizeMartian));
        //act
        //assert
        Assertions.assertFalse(underTest.bookSeat(superHuman.getSpecies(),superHuman.getName()));
        Assertions.assertEquals(null,underTest.getSeats().get(Species.MARTIAN).get(0).getNameOfPersonBooking());
    }



}