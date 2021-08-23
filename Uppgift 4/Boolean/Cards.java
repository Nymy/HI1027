package com.company;


import java.util.Objects;

public class Cards {
    private EnumSuit.Suit suit; // färg
    private EnumRank.Rank rank; // rank

    public Cards(EnumSuit.Suit suit, EnumRank.Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public EnumRank.Rank getRank() {return rank;}
    public EnumSuit.Suit getSuit() {return suit;}

    @Override
    public String toString() {
        return "The card is: " + rank + " of " +suit ;
    }

    @Override
    public boolean equals(Object card) {
        if (this == card) return true;
        if (!(card instanceof Cards)) return false;
        Cards cards = (Cards) card;
        return getSuit() == cards.getSuit() && getRank() == cards.getRank();
    }

}


