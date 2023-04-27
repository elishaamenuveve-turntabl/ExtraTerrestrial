package org.example.spaceship;

import org.example.Species;
import org.example.spaceship.seat.Seat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spaceship {
    private Map<Species, List<Seat>> seats;

    public Spaceship(Map<Species, Integer> species_quantity) {
        seats = new HashMap<>();
        generateSeats(species_quantity);
    }

    private void generateSeats(Map<Species, Integer> species_quantity) {
        for (Species type : species_quantity.keySet()) {
            ArrayList <Seat> species_seat = new ArrayList<>();
            for (int i = 0; i < species_quantity.get(type); ++i) {
                species_seat.add(new Seat(type, type.toString()+(i+1)));
            }
            seats.put(type, species_seat);
        }
    }



    public boolean bookSeat(Species type, String name) {
        if (seats.containsKey(type)) {
            for (Seat seat : seats.get(type)) {
                if (!seat.isBooked()) {
                    seat.book(name);
                    return true;
                }
            }
        }
        return false;
    }

    protected Map<Species, List<Seat>> getSeats() {
        return seats;
    }
}
