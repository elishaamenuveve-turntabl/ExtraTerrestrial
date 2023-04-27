package org.example.spaceship.seat;

public class Seat {
    private String ID;
    private String nameOfPersonBooking;

    protected Seat() {

    }

    protected Seat(String nameOfPersonBooking) {
        this.nameOfPersonBooking = nameOfPersonBooking;
    }
}
