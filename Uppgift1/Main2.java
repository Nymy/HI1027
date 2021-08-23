// 2 dices thrown a number of times

package com.company;

public class Test {
    public static void main(String[] args) {
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);

        int numThrows = (int)(Math.random() * 6) +1;
        for(int i = 1; i <= numThrows; i++){
            System.out.println("Roll " + i + "\n The result of dice 1: " + dice1.throwDice() + "\n The result of dice 2: " +dice2.throwDice());
        }
    }
}
