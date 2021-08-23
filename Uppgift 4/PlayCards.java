package com.company;

public class PlayCards {
    public static void main(String[] args) {
        Cards cards = new Cards(1, 13);
        Cards cards2 = new Cards(2, 12);
        Cards cards3 = new Cards(3, 5);
        Cards cards4 = new Cards(4, 2);
        Cards cards5 = new Cards(1, 8);

        System.out.println(cards.toString());
        System.out.println(cards2.toString());
        System.out.println(cards3.toString());
        System.out.println(cards4.toString());
        System.out.println(cards5.toString());
    }
}
