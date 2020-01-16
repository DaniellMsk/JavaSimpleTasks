package com.danila.generics;

import com.danila.polymorphism.heroes.Enemy;
import com.danila.polymorphism.heroes.Hero;

public class Beastmaster extends Hero {
    public Beastmaster(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Бистмастер атакует ");
    }
}
