package com.company;

public class PlayCards {
    public static void main(String[] args) {
        Cards testcard = new Cards(EnumSuit.Suit.HEARTS, EnumRank.Rank.TEN);
        Cards testcard1 = new Cards(EnumSuit.Suit.HEARTS, EnumRank.Rank.TWO);

        System.out.println(testcard.equals(testcard1));

    }
}
