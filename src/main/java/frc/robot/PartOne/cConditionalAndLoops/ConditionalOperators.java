// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.PartOne.cConditionalAndLoops;

public class ConditionalOperators {

    static boolean theEarthIsFlat;
    static boolean theSkyIsBlue;
    static boolean momIsHome;
    static boolean dadIsHome;
    static boolean doSomething;

    public static void operators() {

        // --------------------------------------------------------------------------------------------------
        // Loops, If Statements, and Switch Statements all use conditional expressions to
        // decide whether they should run or not. For example:
        
        if (theEarthIsFlat == true) {}

        // The "theEarthIsFlat == true" expression tells
        // the if statement that it should only run the code inside of the curly brackets "{}" 
        // if "theEarthIsFlat" is equal to the value "true".  
        
        
        // We could reverse the expression by putting "!=" instead of "==".  That tells the
        // if statement to run only if the value of "theEarthIsFlat" is not true.  Here is
        // a list of common comparison operators used in if statements, loops, and switch
        // statements:

        if (1 == 2) {} // "==" Is equal to
        if (1 != 2) {} // "!=" Is not equal to
        if (1 <= 2) {} // "<=" Is less than or equal to
        if (1 >= 2) {} // ">=" Is greater than or equal to
        if (1 < 2) {}  // "<" and ">" Less than and greater than (respectively)
        
        // Lets say you want two expressions to be true for an If statement to run.
        // For this, we can use the and operator "&&". For example:
        if (theEarthIsFlat == true && theSkyIsBlue == true) {}
        // Both "theEarthIsFlat" and "theSkyIsBlue" must be true in 
        // order for the statement to run.
        
        // Similarly, we can use a double pipe "||" to represent an "or" operator.
        // It's similar to "and" but only one of the expressions has to be true for
        // the statement to run. For instance:
        momIsHome = false;
        dadIsHome = true;
        while (momIsHome == true || dadIsHome == true) {System.out.println("Can I Have Candy?");}
        // In this case, only one of the two parents need to be home for me to bug one of them for candy.
        // --------------------------------------------------------------------------------------------------
    }


}
