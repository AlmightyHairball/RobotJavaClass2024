// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.PartOne.bVariablesAndArrays;

/* Arrays allow you to store bulk amounts of similar data */
public class Arrays {

    


    // ------------------------------------------------------------
    // You can tell if a variable is an array if there is one
    // or more sets of brackets next to the variable's type.

    String[] employees = {"Denny", "Jenny", "Henry", "Kenny"};

    int[] multiplesOfTwo = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    // ------------------------------------------------------------





    // ----------------------------------------------------------------------------------------
    // We can print out one, or multiple entries in the array by using it's index.
    public static void myFunction() {
        String[] squirrels = {"Jeffery", "Humphry", "Jimmy", "Chubs"};
        int[] multiplesOfTen = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // The first item in an array is considered the 0th index.
        // lets print out Jimmy, which would be the 2nd index if you
        // count up from 0.
        System.out.println( squirrels[2] );

        // We can also print how many items are in an array
        System.out.println( multiplesOfTen.length );
    }
    // -----------------------------------------------------------------------------------------




    // -----------------------------------------------------------------------------------------
    // Did you know that you can put arrays in other arrays?...
    // Take a look.  
    String[][] users = { {"Name: Jenny Salazar", "Account: jsalazar@robot.org"}, {"Name: Michael Chester", "Account: mchester@robot.org"} };
    // -----------------------------------------------------------------------------------------
}
