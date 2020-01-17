package com.danila.polymorphism.heroes;

import com.danila.generics.Beastmaster;

import java.util.Random;

public class Zombie extends Enemy {
    private int previousHealth;

    public Zombie(String name, int health, int attack) {
        super(name, health, attack);
        this.previousHealth = health;
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(super.getName() + " бьёт " + (hero instanceof Beastmaster && ((Beastmaster) hero).isBeastIsAlive() ? ((Beastmaster) hero).getBeastName() : hero.getName()) + ", урон: " + super.getAttack());
        hero.takeDamage(super.getAttack());
    }

    @Override
    public void takeDamage(int heroAttack) {
        super.takeDamage(heroAttack);

        Random random = new Random();
        int riseChance = random.nextInt(10);

        if (!isAlive() && riseChance >= 5) {
            rise();
        }

        if (!isAlive() && riseChance < 5) {
            System.out.println("Зомби окончательно убит!");
        }
    }

    public void rise() {
        super.setHealth(previousHealth);
        System.out.println("Зомби воскресает со здоровьем: " + super.getHealth());
    }
}
