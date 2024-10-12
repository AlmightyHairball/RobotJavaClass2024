// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.PartOne.bVariablesAndArrays;

import frc.robot.Robot;

public class Variables {



    // ------------------------------------------------------------------------------------
    // Variables in Java are contiainers that can store various types of data,
    // here are some common ones.

    // A char can store a single character
    char mySingleCharacterVariable = '@';

    // A String stores a bunch of characters or (String of characters)
    String myStringVariable = "Help me, I'm stuck in a variable!";

    // An Integer can store whole numbers
    int myIntegerVariable = 5413;

    // doubles can hold foating point number, otherwise known
    // as numbers with decemals.
    double myNumberVariableWithDecimal = 54.13;

    // booleans can store one of two values, "true" or "false"
    boolean myTrueOrFalseVariable = true;
    // ------------------------------------------------------------------------------------





    // ------------------------------------------------------------------------------------
    // Variables can also store items called objects (We'll get into that at a later point)

    // This variable has a type of "Robot"
    Robot myRobotObjectVariable = new Robot();
    // ------------------------------------------------------------------------------------




    // --------------------------------------------------
    // Instead of printing hello world,
    // we can print the value of our variable.
    public static void displayValueOfVariable() {

        var myVariable = "Whats Up Java?";

        System.out.println(myVariable);

    }
    // --------------------------------------------------

}
