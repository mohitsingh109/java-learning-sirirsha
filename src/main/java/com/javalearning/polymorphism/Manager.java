package com.javalearning.polymorphism;

public class Manager extends Employee{

    private String teamName;

    public Manager(String name, double salary, String teamName) {
        super(name, salary);
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public void addBonus(double bonus) {
        super.addBonus(bonus + 10); // additional 10$
    }
}
