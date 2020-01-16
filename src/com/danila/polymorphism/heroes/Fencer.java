package com.danila.polymorphism.heroes;

public class Fencer extends Enemy {
    private boolean isCounterAttack;

    public Fencer(String name, int health, int attack) {
        super(name, health, attack);
        isCounterAttack = false;
    }

    @Override
    public void attackHero(Hero hero) {
        if (isCounterAttack) {
            System.out.println(super.getName() + " проводит быструю контратаку против " + hero.getName() + ", урон: 10");
            hero.takeDamage(10);
            isCounterAttack = false;
        }

        System.out.println(super.getName() + " колет рапирой " + hero.getName() + ", урон: " + super.getAttack());
        hero.takeDamage(super.getAttack());
    }

    @Override
    public void takeDamage(int heroAttack) {
        super.takeDamage(heroAttack);
        isCounterAttack = true;
    }
}
