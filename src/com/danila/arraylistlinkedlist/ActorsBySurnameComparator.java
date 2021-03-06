package com.danila.arraylistlinkedlist;

import java.util.Comparator;

public class ActorsBySurnameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        return actor1.getLastName().compareTo(actor2.getLastName());
    }
}
