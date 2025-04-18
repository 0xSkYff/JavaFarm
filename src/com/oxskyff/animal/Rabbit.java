package com.oxskyff.animal;

import org.jetbrains.annotations.NotNull;

public class Rabbit extends Animal{
    public Rabbit(@NotNull String name) {
        super(name);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rabbit )) return false;
        Rabbit rabbit = (Rabbit) o;
        if (rabbit.getName().equals( this.getName())) return true;
        return false;
    }
}
