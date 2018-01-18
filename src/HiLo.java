/**
 * HiLo - A guessing game
 * Learn Java The Easy Way, by Bryson Payne, Chapter 2
 */

/**
 * @author jlcooke
 */

import	 java.util.Scanner;

public class HiLo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = ""; // Holds answer from user on replay desire
		do { // Game loop
			int theNumber = (int) (Math.random() * 100 + 1); // Random number for the user to guess
			int guess = 0; // Holds the user's guess
			int numGuesses = 0; // Holds counter for user performance evaluation
			String result = ""; // Holds our evaluation of the guess (high, low, correct)
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100:");
				guess = scan.nextInt();
				numGuesses++;
				if (guess < theNumber) {
					result = "low";
				} else if (guess > theNumber) {
					result = "high";
				} else {
					result = "CORRECT";
				}
				System.out.println("Your guess, " + guess + ", was " + result);
				// System.out.println("The correct answer is: " + theNumber);
			} // while (guess != theNumber) {
			System.out.println("You won with " + numGuesses + " guesses!");
			System.out.println("\nWould you like the play again (y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("\nThank you for playing. Goodbye!");
		scan.close();
	}
}

