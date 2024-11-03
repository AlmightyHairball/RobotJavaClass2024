// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.PartOne;

import java.util.Scanner;

/** At the end of part 1, assuming theres time,
 * students will be walked through the process of
 * creating a simple guessing game.
 */
public class GuessingGame {

    static Scanner userInput = new Scanner(System.in);

    // Students should be instructed to put all their variables
    // and logic in a desegnated method.
    public static void guessGame() {

        // Declare the number we choose
        int myNumber = 16;

        // Ask the user to enter a guess
        System.out.println("I'm thinking of a number, can you guess it?\n\nEnter your guess:");

        // Get our guess in the form of an integer
        int guess = userInput.nextInt();

        // Inform the user of whether they were correct or not by comparing
        // the user input to the number we chose.
        if (guess == myNumber) {
            // gets run if the numbers match.
            System.out.println("Your guess was correct, you deserve a cookie! 🍪");
        } else {
            // gets run if the numbers don't match.
            System.out.println("Your guess was incorrect, try again another time. 😞");
        }

    }



    // Guessing game that includes a while loop.
    public static void guessGameLoops() {

        // Declare the number we choose
        int myNumber = 16;

        // We can encompass our code in a while loop so that it repeats
        // until we get it right.
        while (true) {

            // Ask the user to enter a guess
            System.out.println("I'm thinking of a number, can you guess it?\n\nEnter your guess:");

            // Get our guess in the form of an integer
            int guess = userInput.nextInt();

            // Inform the user of whether they were correct or not by comparing
            // the user input to the number we chose.
            if (guess == myNumber) {
                // gets run if the numbers match.
                System.out.println("Your guess was correct, you deserve a cookie! 🍪");

                // Since the user guessed correct, we can break out of the
                // loop and end the game.
                break;
            } else {
                // gets run if the numbers don't match.
                System.out.println("Your guess was incorrect, try again another time. 😞\n\n\n");
            }

        }

    }


    // Guess game with loops, limit, and keeps track of tries
    public static void guessGameLoopsTries() {

        // Declare the number we choose
        int myNumber = 16;
        int numberOfTries = 5;

        // We can encompass our code in a while loop so that it repeats
        // until we get it right.
        while (numberOfTries > 0) {

            // Ask the user to enter a guess
            System.out.println("I'm thinking of a number, can you guess it? You have " + numberOfTries +" tries left.\n\nEnter your guess:");

            // Get our guess in the form of an integer
            int guess = userInput.nextInt();

            // Inform the user of whether they were correct or not by comparing
            // the user input to the number we chose.
            if (guess == myNumber) {
                // gets run if the numbers match.
                System.out.println("Your guess was correct, you deserve a cookie! 🍪");

                // Since the user guessed correct, we can break out of the
                // loop and end the game.
                break;
            } else {
                // gets run if the numbers don't match.
                System.out.println("Your guess was incorrect, try again. 😞\n\n\n");

                // Subtract from our amount of tries
                numberOfTries = numberOfTries - 1;

                if (numberOfTries <= 0) {
                    System.out.println("Your all out of tries. Why don't you take a break for a little while.");
                }

            }

        }

    }



}
