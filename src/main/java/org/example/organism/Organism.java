package org.example.organism;

import org.example.Species;

public abstract class Organism {
    protected final Species species;
    protected final String name;


    protected Organism(Species species, String name) {
        this.species = species;
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }
}
