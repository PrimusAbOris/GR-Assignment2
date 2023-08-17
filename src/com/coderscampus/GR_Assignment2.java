package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class GR_Assignment2 {

	public static void main(String[] args) {
		// THE MOST BORING MINIGAME EVER
		Random zohar = new Random();
		int monad = zohar.nextInt(100) + 1;
		
		for (int i = 5; i >= 1; i--) {
			//System.out.println("TOTAL SENTENCE IMPOSED IS " + i);
			System.out.println("GUESSES LEFT: " + i);
			System.out.println("Type in a number between 1 and 100.");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			Integer dyad = Integer.parseInt(input);
			
			// win condition; comment this out
			dyad = monad;
			
			if (monad == dyad) {
				System.out.println("BINGO!\n"
						+ "This message will self-destruct in 4 seconds!");
				wait(4);
				// test message before returning
				System.out.println("Returning");
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
			if ((dyad < 1) | (dyad > 100)) {
				System.out.println("I am not familiar with such a number."
					+ "\nThere are only the counting numbers from 1 to 100.");
			}
		}
		System.out.println("It's a sad thing that your adventures have ended here!");
		// test message before returning
		System.out.println("Returning");
		return;
	}
	
	public static void wait(int sec) {
		 try {
			 Thread.currentThread().sleep(sec * 1000);
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
	 }

}
