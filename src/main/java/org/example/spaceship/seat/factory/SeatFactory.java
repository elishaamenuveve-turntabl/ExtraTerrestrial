package org.example.spaceship.seat.factory;

import org.example.Species;
import org.example.spaceship.seat.HumanSeat;
import org.example.spaceship.seat.MartianSeat;
import org.example.spaceship.seat.Seat;

public enum SeatFactory {
    INSTANCE;

    public Seat createSeat(Species type, String id) {
        switch (type.toString()) {
            case ("Human"):
                return new HumanSeat(id);
            case ("Martian"):
                return new MartianSeat(id);
        }
        return new Seat(null, id) {
            @Override
            public Species getType() {
                return super.getType();
            }
        };
    }

}
