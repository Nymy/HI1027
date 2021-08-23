package com.company;

public class Account1Main {

    public static void main(String[] args) {
        Account1 acc = new Account1(5000, "Anders", 12543325);
        Account1 acc2 = new Account1(5000, "Nicklas", 1254685);
        Account1 acc3 = new Account1(5000, "Nonno", 52462);
        Account1 acc4 = new Account1(5000, "Malcolm", 1337);

        System.out.println(acc.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
        System.out.println(acc4.toString());


    }
}

