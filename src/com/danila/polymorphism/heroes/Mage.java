package com.danila.polymorphism.heroes;

public class Mage extends Hero {
    public Mage(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(super.getName() + " кастует заклинание в " + enemy.getName() + ", урон: " + super.getAttack());
        enemy.takeDamage(super.getAttack());
    }
}
