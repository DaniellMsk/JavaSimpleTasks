package com.danila.polymorphism.heroes;

public abstract class Hero implements Mortal {
    private String name;
    private int health;
    private int attack;

    public Hero(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void takeDamage(int enemyAttack) {
        health -= enemyAttack;
        if (!isAlive()){
            health = 0;
            System.out.println(name + " убит!");
        }
        System.out.println("Оставшееся здоровье: " + health);
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
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

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
