package com.danila.polymorphism.heroes;

public class Vampire extends Enemy {
    public Vampire(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(super.getName() + " кусает " + hero.getName()  + ", урон: " + super.getAttack());
        hero.takeDamage(super.getAttack());
        takeHealth();
    }

    public void takeHealth() {
        System.out.println("Вампир восстанавливает здоровье, выпивая кровь героя на " + super.getAttack());
        super.setHealth(getHealth() + super.getAttack());
        System.out.println("Здоровье после восстановления: " + super.getHealth());
    }
}
