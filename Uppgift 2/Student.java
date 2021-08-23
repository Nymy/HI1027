package com.company;

public class Student {
    String name;
    String program;
    int creditPoints;

    public Student(String name, String program, int creditPoints){
        this.name = name;
        this.program = program;
        this.creditPoints = creditPoints;
    }

    public int addCreditPoints(int addPoints){
        this.creditPoints = this.creditPoints + addPoints;
        return this.creditPoints;
    }

    public String setProgram(String newProgram){
        this.program = newProgram;
        return this.program;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getCreditPoints() {
        return creditPoints;
    }
}
