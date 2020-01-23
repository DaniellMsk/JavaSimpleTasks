package com.danila.arraylistlinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActorAction {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Джонни", "Депп", 5500, 51));
        actors.add(new Actor("Денни", "де Вито", 5000,60));
        actors.add(new Actor("Джонни", "Крейг", 4300, 42));
        actors.add(new Actor("Джон", "Траволта", 5100,57));
        actors.add(new Actor("Брюс", "Уиллис", 5200,58));

        System.out.println(actors.toString());

        Actor actorWithMaxFee = fireActor(actors);

        actors.remove(actorWithMaxFee);

        System.out.println(actors.toString());

        actors.add(new Actor("Джонни", "Депп", 5500, 51));

        Collections.sort(actors);

        System.out.println(actors.toString());

        Comparator<Actor> comp = new ActorsByNameComparator().thenComparing(new ActorsBySurnameComparator());

        actors.sort(comp);

        System.out.println(actors.toString());
    }

    public static Actor fireActor(ArrayList<Actor> actors) {
        Actor actorWithMaxFee = new Actor("L", "L", 0, 0);

        for (Actor actor : actors) {
            if (actorWithMaxFee.getFee() < actor.getFee()) {
                actorWithMaxFee = actor;
            }
        }
        return actorWithMaxFee;
    }
}
