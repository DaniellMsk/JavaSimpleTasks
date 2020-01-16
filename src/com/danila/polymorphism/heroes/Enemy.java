package com.danila.polymorphism.heroes;

public abstract class Enemy implements Mortal {
    private String name;
    private int health;
    private int attack;

    public Enemy(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public abstract void attackHero(Hero hero);

    public void takeDamage(int heroAttack) {
        health -= heroAttack;
        if (!isAlive()){
            health = 0;
            System.out.println(name + " убит!");
        }
        System.out.println("Оставшееся здоровье: " + health);
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }
}
