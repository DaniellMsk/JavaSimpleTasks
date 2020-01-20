package com.danila.collections1;

import java.util.Comparator;

public class ActorsByNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        return actor1.getFirstName().compareTo(actor2.getFirstName());
    }
}
