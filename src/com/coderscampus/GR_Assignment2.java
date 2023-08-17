package com.coderscampus;

import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class GR_Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		Random zohar = new Random();
		int monad = zohar.nextInt(100) + 1;
		// knightOfFire();
		System.out.println("Begin!");
		
		for (int i = 5; i >= 1; i--) {
			System.out.println("GUESSES LEFT: " + i);
			System.out.println("Type in a number between 1 and 100.");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			Integer dyad = Integer.parseInt(input);
			
			// win condition; comment this out
			// dyad = monad;
			
			if ((dyad < 1) | (dyad > 100)) {
				System.out.println("I am not familiar with such a number."
					+ "\nThere are only the counting numbers from 1 to 100.\n"
					+ "Your guess has been refunded.");
				i++;
			}
			else {
				if (monad == dyad) {
					System.out.println("BINGO!\n"
							+ "This message will self-destruct in 4 seconds!");
					Thread.sleep(4000);
					// test message before returning
					System.out.println("Returning after a victory");
					return;
				}
				else {
					System.out.print("Incorrect! Your number was ");
					if (monad > dyad) {
						System.out.println("TOO LOW!");
					} else if (monad < dyad) {
						System.out.println("TOO HIGH!");
					}
				}
			}
			
		}
		System.out.println("It's a sad thing that your adventures have ended here!\n"
				+ "The number was " + monad + ".");
		// test message before returning
		System.out.println("Returning after a loss");
		return;
	}
	
	public static void knightOfFire() throws InterruptedException {
		int s = (60000 / 132) * 4;
		String sen = "TOTAL SENTENCE IMPOSED IS TEN";
		for (int k = 4; k >= 1; k--) {
			System.out.println(sen);
			Thread.sleep(s);
		}
	}

}
