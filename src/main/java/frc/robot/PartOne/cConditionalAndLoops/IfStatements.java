// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.PartOne.cConditionalAndLoops;

public class IfStatements {
    
    public static void toCharge() {

        boolean isItDay = true;

        // ----------------------------------------------------------------------
        // If statements allow your code to make descisions
        if (isItDay == true) {
            // the code inside these brackets will only
            // run if the isItDay variable is equal to true.
            System.out.println("Charging using the solar pannels");
        }
        // ----------------------------------------------------------------------

    }




    public static void toChargeOrDock() {

        // ----------------------------------------------------------------------
        // Notice how isItDay is now false.
        boolean isItDay = false;

        // Else statements allow your code to do something else if your
        // condition isn't true.
        if (isItDay == true) {

            System.out.println("Charging using the solar pannels");

        } else {

            // This code runs if the isItDay variable is not true
            System.out.println("Charging using a power adapter");

        }
        // ----------------------------------------------------------------------

    }

}
