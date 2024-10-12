// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.PartOne.dFunctions;


public class Functions {

    // ------------------------------------------------------------------
    // A function is simpily a block of code that can be run or
    // invoked by other parts of your program.  Here, we have
    // this beAnnoyingFunction that will be spam "are we there yet"
    // when it is called on. 
    public static void beAnnoyingFunction() {

        for (int i = 0; i <= 20; i++) {
            System.out.println("Are we there yet?");
        }

    }

    //                      |
    //                     \/

    // Here is a function that calls on (invokes) the beAnnoyingFunction.
    public static void myUnsuspectingFunction() {

        beAnnoyingFunction();

        // This will be run once the beAnnoyingFunction above finishes.
        System.out.println("NO, WERE NOT THERE YET!");

    }
    // ------------------------------------------------------------------








    // ----------------------------------------------------------------------------
    // We can also create functions that take parameters.  This allows the code
    // that is calling the function to pass some specific values for the function to
    // process.
    public static void addingMachine(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    //                 |
    //                \/

    // Here, we are calling the addingMachine function and passing
    // in two variables for it to calculate the sum of.
    public static void functionCaller() {
        int number1 = 5;
        int number2 = 18;
        addingMachine(number1, number2);
    }
    // ----------------------------------------------------------------------------








    // -------------------------------------------------------------------------------------------
    // Lets say I want to store the output of my adding machine in a variable.  Our adding
    // machine at the moment doesent give the sum back to the code that asked for it.  It rather,
    // just prints it directly out to the console.  Luckly, functions allow us to do whats called returning
    // data.  This is when a function gives a value back to the code that called it.  Below is
    // an improved adding machine that returns it's sum to the calling code.
    public static int addingMachineVersionTwo(int num1, int num2) {
        //        /\
        //        |
        // We specify type "int" between the "static" and the function name instead of
        // void because we're telling the function that it is returning an integer, which
        // in this case is our sum of the first and second number we are given.
        return num1 + num2;
    }

    //                  |
    //                 \/

    public static void functionCallerVersionTwo() {
        int number1 = 50;
        int number2 = -18;

        // notice how the return statement in the new adding function
        // allows us to store the returned value in a new variable
        // called "mySum".  I'm then printing out "mySum" to the 
        // console (using the code I called the adding machine with).
        int mySum = addingMachineVersionTwo(number1, number2);
        System.out.println(mySum);
    }
    // --------------------------------------------------------------------------------------------


}
