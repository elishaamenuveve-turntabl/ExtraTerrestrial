package org.example.spaceship.seat;

import org.example.Species;

import java.util.Objects;

public class Seat {
    //TODO: Make class abstract, and sort out construction
    protected final Species type;
    protected final String ID;
    protected String nameOfPersonBooking;


    public Seat(Species type, String id) {
        this.type = type;
        ID = id;
    }



    public Species getType() {
        return type;
    }

    public boolean isBooked() {
        return !Objects.equals(nameOfPersonBooking, "");
    }

    public void book(String name) {
        this.nameOfPersonBooking = name;
    }

    public void serveMeal(String meal) {
        if (this.isBooked())
            if (this.isBooked())
                System.out.println("Served " + meal + " to Passenger " + nameOfPersonBooking + " on  seat " + ID);
    }


}
