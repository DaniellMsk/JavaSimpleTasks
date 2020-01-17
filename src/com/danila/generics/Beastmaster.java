package com.danila.generics;

import com.danila.polymorphism.heroes.Enemy;
import com.danila.polymorphism.heroes.Hero;

public class Beastmaster extends Hero {

    String beastName;
    int beastHealth;
    int beastAttack;
    Beast beast;
    boolean beastIsAlive;

    public Beastmaster(String name, int health, int attack, String beastName, int beastHealth, int beastAttack) {
        super(name, health, attack);
        this.beastName = beastName;
        beast = new Beast(beastName, beastHealth, beastAttack);
        beastIsAlive = true;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(super.getName() + " бьёт палкой " + enemy.getName() + ", урон: " + super.getAttack());
        enemy.takeDamage(super.getAttack());
        beast.attackEnemy(enemy);
    }

    @Override
    public void takeDamage(int enemyAttack) {
        if (beast.isAlive()) {
            beast.takeDamage(enemyAttack);
        } else {
            setHealth(getHealth() - enemyAttack);
            if (!isAlive()) {
                setHealth(0);
                System.out.println(getName() + " убит!");
            }
            System.out.println("Оставшееся здоровье: " + getHealth());
        }
    }


    public boolean isBeastIsAlive() {
        return beastIsAlive;
    }

    public void setBeastIsAlive(boolean beastIsAlive) {
        this.beastIsAlive = beastIsAlive;
    }

    public String getBeastName() {
        return beastName;
    }

    public void setBeastName(String beastName) {
        this.beastName = beastName;
    }

    public class Beast extends Hero {
        public Beast(String name, int health, int attack) {
            super(name, health, attack);
        }

        @Override
        public void takeDamage(int enemyAttack) {
            setHealth(getHealth() - enemyAttack);
            if (!isAlive()){
                setHealth(0);
                System.out.println(getName() + " убит!");
                beastIsAlive = false;
            }
            System.out.println("Оставшееся здоровье: " + getHealth());
        }

        @Override
        public void attackEnemy(Enemy enemy) {
            if (beast.isAlive()) {
                System.out.println(super.getName() + " кусает " + enemy.getName() + ", урон: " + super.getAttack());
                enemy.takeDamage(super.getAttack());
            }
        }
    }
}
