package com.company;
import java.util.Random;

public class Dice {
    private int sides;
    private int upSide;

// dSides = how many sides the dice has
    public Dice(int dSides){
        if (dSides < 1)
            return;
        sides = dSides;
        upSide = 1;
    }

    public int throwDice(){
        upSide = (int)(Math.random()*sides) +1;
        return upSide;
    }

    public int getValue(){
        return upSide;
    }

    public String toString(){
        return "The side of the dice that is shown is: " + getValue();
    }
}
