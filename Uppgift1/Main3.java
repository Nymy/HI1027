//Rolls a dice a 1000 times and prints the frequency 
package com.company;

public class Test {
    public static void main(String[] args) {
        Dice dice1 = new Dice(6);

        int[] freq = {0,0,0,0,0,0};
        for(int i = 0; i < 1000; i++){
            dice1.throwDice();
            freq[dice1.getValue()-1] = freq[dice1.getValue()-1] +1;
        }
        for (int j = 0; j < freq.length; j++){
            System.out.println("Side " + (j+1) + " has been rolled: " + freq[j] + " amount of times");
        }
    }
}
