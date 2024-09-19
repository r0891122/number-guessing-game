package com.marie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the number guessing game!");
        int rand = (int)(Math.random() * 100);
        //System.out.println(rand);

        System.out.println("Select a difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");

        System.out.print("Your choice: ");
        int choice = in.nextInt();
        int chances;

        switch (choice) {
            case 2:
                System.out.println("Great! You have selected the Medium difficulty level.");
                chances = 5;
                break;

            case 3:
                System.out.println("Great! You have selected the Hard difficulty level.");
                chances = 3;
                break;

            default:
                System.out.println("Great! You have selected the Easy difficulty level.");
                chances = 10;
        }

        System.out.println("Let's start the game!");

        int attempts = 1;
        while (chances > attempts) {
            System.out.print("Enter your guess: ");
            int guess = in.nextInt();
            if (guess == rand) {
                System.out.println("Congratulations! You have guessed the correct number in " + attempts+ " attempts.");
                break;
            }
            System.out.println("Incorrect! Try again.");
            attempts++;

        }




    }
}