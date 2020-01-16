package com.danila.polymorphism.heroes;

public class Warrior extends Hero {

    public Warrior(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(super.getName() + " бьёт мечом " + enemy.getName() + ", урон: " + super.getAttack());
        enemy.takeDamage(super.getAttack());
    }
}
