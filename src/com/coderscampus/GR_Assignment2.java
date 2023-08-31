package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class GR_Assignment2 {

	public static void main(String[] args) {
		Random zohar = new Random();
		int monad = zohar.nextInt(100) + 1;
		// test case:
		// System.out.println(monad);
		
		for (int i = 5; i >= 1; i--) {
			System.out.print("Pick a number between 1 and 100 ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			Integer dyad = Integer.parseInt(input);

			
			if ((dyad < 1) || (dyad > 100)) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				i++;
				}
			else {
				if (monad == dyad) {
					System.out.println("You win!");
					scanner.close();
					return;
				}
				else {
					System.out.print("Please pick a ");
					if (monad > dyad) {
						System.out.println("higher number");
					} else if (monad < dyad) {
						System.out.println("lower number");
					}
				}
			}

			
		}
		System.out.println("You lose!\n"
				+ "The number to guess was: " + monad);
		return;
	}

}
