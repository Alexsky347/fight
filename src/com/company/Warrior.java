package com.company;

public class Warrior {
    public Health health = new Health();
    public Level level = new Level(); // every enemy kill += 1

    private boolean isAlive(boolean alive){
        Alive.isAlive = alive;
        return Alive.isAlive;
    }

    public Object attack(Warrior warrior, Point point, Warrior warrior1){

        int points = warrior.health.changeHealth(new Point(warrior1.level.number * point.num), new Type("attack"));

        if(points <= 0){
            warrior.health.points = 0;

            warrior.isAlive(false);

            return "The warrior is dead now, level warrior: "
                    + warrior.level.changeLevel(new Type("down"))+
                    "\n"+
                    "The other warrior has level: " + warrior1.level.changeLevel(new Type("up"));
        }
        return points;
    };

    public Object treat(Warrior warrior, int point, Warrior warrior1){
        if(!Alive.isAlive){
            return "The warrior is dead you can't treat him";
        }

        return warrior.health.changeHealth(new Point(warrior1.level.number * point), new Type("treat"));
    };

}
