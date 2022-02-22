package com.company;

public class Health {

    int points = 1000;

    public int changeHealth(Point num, Type type) {
        if(type.type.equals("attack")){
            points -= num.num;
        }

        if(type.type.equals("treat")){
            points += num.num;
        }

        return points;
    }
}
