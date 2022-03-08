package com.company;

public class Main {

    public static void main(String args[]) {

        Warrior warrior1 = new Warrior();
        System.out.println("warrior 1 health points -> " +  warrior1.health.points);
        System.out.println("warrior 1 level -> " +  warrior1.level.number);

        System.out.println("----------------------------------------------");

        Warrior warrior2 = new Warrior();
        System.out.println("warrior 2 health points -> " +  warrior2.health.points);
        System.out.println("warrior 2 level -> " +  warrior2.level.number);

        System.out.println("----------------------------------------------");

        System.out.println("warrior1 is attacking warrior2: " +  warrior1.attack(warrior2, new Point(950), warrior1));
        System.out.println("warrior2 health: " + warrior2.health.points);

        System.out.println("----------------------------------------------");

        warrior1.treat(warrior2, 950, warrior1);
        System.out.println("warrior2 health: " + warrior2.health.points);

        System.out.println("----------------------------------------------");

        System.out.println("warrior1 is attacking warrior2: " + warrior1.attack(warrior2, new Point(1100), warrior1));
        System.out.println("warrior2 health: " + warrior2.health.points);

        System.out.println(warrior1.attack(warrior2, new Point(1100), warrior1));

    }
}
