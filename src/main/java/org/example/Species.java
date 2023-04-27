package org.example;

public enum Species {
    //TODO: AbstractFactory Method
    HUMAN ("Human"),
    MARTIAN ("Martian");

    private String speciesAsString;
    Species(String speciesAsString) {
        this.speciesAsString = speciesAsString;
    }

    @Override
    public String toString() {
        return speciesAsString;
    }
}
