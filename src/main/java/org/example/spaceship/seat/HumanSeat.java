package org.example.spaceship.seat;

import org.example.Species;

public class HumanSeat extends Seat{

    public HumanSeat(String id) {
        super(Species.HUMAN, id);
    }

    @Override
    public void serveMeal(String meal) {
        if (this.isBooked())
        System.out.println("Served human " + meal + " to Passenger " + nameOfPersonBooking + " on  seat " + ID);
    }
}
