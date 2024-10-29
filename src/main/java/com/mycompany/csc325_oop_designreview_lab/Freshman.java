package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    public Freshman(String name, int age) {
        super(name, age); // Call the constructor of the Student class
    }

    @Override
    public String toString() {
        return "Freshman: " + super.toString();
    }
}
