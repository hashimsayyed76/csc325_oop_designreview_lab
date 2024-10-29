/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
        // Initialize the Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Creating a Student object
        Student std1 = new Student("James", 20);
        System.out.println(std1); // Display initial student information

        // Creating a Freshman object (corrected constructor usage)
        Freshman freshman = new Freshman("Alice", 18);
        System.out.println(freshman); // Display freshman information

        // Creating a Senior object with at least 85 credits
        Senior senior = new Senior("John", 30, 90);
        System.out.println(senior); // Display senior information

        // ToDo 12: Set the GPA of the freshman using Scanner input
        System.out.print("Enter GPA for the freshman: ");
        double gpa = scanner.nextDouble();
        freshman.setGpa(gpa); // Setting the GPA
        System.out.println("Updated Freshman: " + freshman); // Display updated information

        // Closing the scanner to prevent resource leaks
        scanner.close();

        // ToDo 13: Additional comments explaining the code are included above.
    }