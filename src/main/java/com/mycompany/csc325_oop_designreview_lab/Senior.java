package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Students {
    private int credits; // Field to store credits

    public Senior(String name, int age, int credits) {
        super(name, age); // Call the constructor of the Student class
        if (credits < 85) {
            throw new IllegalArgumentException("Senior must have at least 85 credits.");
        }
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Senior: " + super.toString() + ", Credits: " + credits;
    }
}
