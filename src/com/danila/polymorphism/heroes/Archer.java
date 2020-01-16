package com.danila.polymorphism.heroes;

public class Archer extends Hero {
    public Archer(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(super.getName() + " стреляет из лука в " + enemy.getName() + ", урон: " + super.getAttack());
        enemy.takeDamage(super.getAttack());
    }
}
