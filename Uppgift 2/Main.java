package com.company;

public class Uppg2 {
    public static void main(String[] args) {
        Student student = new Student("Nonno", "Datateknik", 120);
        System.out.println("Program: " + student.getProgram());
        student.setProgram("Byggteknik");
        System.out.println("Program: " + student.getProgram());
        student.addCreditPoints(120);
        System.out.println("Creditpoints: " + student.getCreditPoints());
    }
}
