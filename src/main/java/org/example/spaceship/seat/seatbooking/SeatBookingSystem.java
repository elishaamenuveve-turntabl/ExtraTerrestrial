package org.example.spaceship.seat.seatbooking;

import org.example.organism.Organism;
import org.example.spaceship.Spaceship;

public enum SeatBookingSystem {
    INSTANCE;

    public boolean bookSeat(Spaceship spaceship, Organism organism) {
        return spaceship.bookSeat(organism.getSpecies(), organism.getName());
    }
}
