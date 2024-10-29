/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter

	// ToDo 4: Add comments to your code
	private double gpa; // Field to store GPA

	// Constructor
	public Student(String name, int age) {
		super(name, age); // Call the constructor of the Human class
		this.gpa = 0.0; // Default GPA
	}

	// Implement abstract methods from Human
	@Override
	public void setAddress(String address) {
		// Implementation for setting address (not shown in this example)
	}

	@Override
	public String getAddress() {
		// Implementation for getting address (not shown in this example)
		return null; // Placeholder
	}

	// Setter for GPA
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// Getter for GPA
	public double getGpa() {
		return gpa;
	}

	// toString method to return student information
	@Override
	public String toString() {
		return "Student Name: " + getName() + ", Age: " + getAge() + ", GPA: " + gpa;
	}
}
