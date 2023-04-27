package org.example.spaceship.seat;

import org.example.Species;

public class MartianSeat extends Seat{
    public MartianSeat(String id) {
        super(Species.MARTIAN, id);
    }

    @Override
    public void serveMeal(String meal) {
        if (this.isBooked())
            System.out.println("Served martian " + meal + " to Passenger " + nameOfPersonBooking + " on  seat " + ID);
    }
}
