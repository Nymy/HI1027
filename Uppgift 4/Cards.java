package com.company;

public class Cards {
    private int suit; // färg
    private int rank; // rank

    public Cards(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() {return rank;}
    public int getSuit() {return suit;}

    @Override
    public String toString() {
        return "Cards{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}

