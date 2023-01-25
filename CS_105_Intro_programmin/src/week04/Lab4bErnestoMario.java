package week4;

import java.util.Scanner;

public class Lab4bErnestoMario {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String userInput = "";



		boolean isValidInput = false;

		while (!isValidInput) {
			System.out.print("Do you like to code in Java?: ");
			userInput = in.nextLine();

			if (userInput.equalsIgnoreCase("Y")) {
				System.out.println("That's great! I do too!");
				isValidInput = true;
			} else if (userInput.equalsIgnoreCase("N")) {
				System.out.println("That's ok. There are many other wonderful things in life to learn.");
				isValidInput = true;
			} else  {
				System.out.println("Error: Please answer with a 'Y' or 'N'.");
			}
		}

	}
}
  