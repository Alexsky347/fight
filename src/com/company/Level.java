package com.company;

public class Level {

    public int number = 1;

    public int changeLevel(Type type) {

        if(type.type.equals("up")){
            number++;
        }

        if(number > 1){
            if(type.type.equals("down")){
                number--;
            }
        }

        return number;
    }
}
