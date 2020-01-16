package com.danila.polymorphism.heroes;

import java.util.Random;

public class Battleground {
    public static void main(String[] args) {
        Hero hero = new Warrior("Конан-Варвар", 500, 45);

        Random random = new Random();

        int countOfEnemies = random.nextInt(10) + 1;

        Enemy [] enemies = new Enemy[countOfEnemies];

        for (int i = 0; i < countOfEnemies; i++) {

            int typeOfEnemy = random.nextInt(3) + 1;

            switch (typeOfEnemy){
                case 1:
                    enemies[i] = new Zombie("Зомби", 100, 20);
                    System.out.println("Зомби создан");
                    break;
                case 2:
                    enemies[i] = new Vampire("Вампир", 200, 25);
                    System.out.println("Вампир создан");
                    break;
                case 3:
                    enemies[i] = new Fencer("Дуэлянт", 50, 50);
                    System.out.println("Дуэлянт создан");
                    break;
                default:
                    System.out.println("Проблемы с созданием врага");
            }
        }

        boolean allEnemies = true;

        while (allEnemies && hero.isAlive()) {
            allEnemies = false;

            for (int i = 0; i < countOfEnemies; i++) {
                if(enemies[i].isAlive()) {
                    allEnemies = true;
                    break;
                }
            }
            for (int i = 0; i < countOfEnemies; i++) {
                if (hero.isAlive() && enemies[i].isAlive()) {
                    hero.attackEnemy(enemies[i]);
                }
                if (enemies[i].isAlive()) {
                    enemies[i].attackHero(hero);
                }
            }
        }
    }
}
