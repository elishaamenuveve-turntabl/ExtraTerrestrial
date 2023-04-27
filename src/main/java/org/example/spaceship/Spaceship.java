package org.example.spaceship;

import org.example.spaceship.seat.Seat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spaceship {
    private Map<String, Seat> seats;

    public Spaceship() {
        seats = new HashMap<>();
    }
}
