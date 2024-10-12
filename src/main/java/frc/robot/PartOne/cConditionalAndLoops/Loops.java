// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.PartOne.cConditionalAndLoops;


public class Loops {


    // loops allow us to repeat code
    public static void ferrisWheel() {

        // ----------------------------------------------------------------
        // "For" loops allow us to repeat code and keep
        // track of how many times it loops.  We can
        // tell it to terminate once a certain condition
        // is met, kind of like an if statement.
        for (int incrament = 0; incrament <= 5; incrament = incrament + 1) {
            // There are 3 main parts of a For loop separated
            // by semicolons ";".  The first one is what it does
            // when the loop starts.  The loop will terminate when
            // the middle condition becomes true. Finally,
            // The third part runs every time it loops.

            // This will print out the incrament variable on each loop.
            System.out.println("Incrament is: " + incrament);
        }
        // ----------------------------------------------------------------

    }


    public static void doLife() {

        boolean amIAlive = true;

        // ------------------------------------------------------------------------------------------
        // While loops are a simplified version of for loops.
        // For loops can actually be created from while loops.
        // All they do is repeat code while a condition is true.
        // It breaks the moment the condition is no longer true.
        while (amIAlive) {
            System.out.println("Eat, Sleep, Build Robots, Repeat (or not if the loop breaks.)");


            // Dont worry about this, it just causes it to wait a half a second before looping again.
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // -------------------------------------------------------------------------------------------

    }

}
