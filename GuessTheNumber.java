package oasisInfobyte2;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; 
        int guessCount = 0; 
        int maxGuesses = 5; 
        int score = 0; 
        boolean win = false; 

        System.out.println("Welcome to Guess the Number game!");
        System.out.println("You have " + maxGuesses + " attempts to guess the number.");

        while (guessCount < maxGuesses) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = input.nextInt();
            guessCount++;

            if (guess == secretNumber) {
                win = true;
                score += (maxGuesses - guessCount) * 10; // give points based on the number of attempts
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low!");
            } else {
                System.out.println("Your guess is too high!");
            }
        }

        if (win) {
            System.out.println("Congratulations! You guessed the number in " + guessCount + " attempts.");
            System.out.println("Your score is " + score);
        } else {
            System.out.println("Sorry, you have used all your attempts. The number was " + secretNumber);
        }
    }
}
