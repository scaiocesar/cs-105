package week05;

import java.util.Scanner;

public class Lab5i {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int startNum = 0;
		int endNum = 0;
		int multiplier = 0;


		boolean keepPlay = true;
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED = "\u001B[31m";

		while (keepPlay) {
			while (true) {
				try {
					System.out.println("Please enter the starting number: ");
					startNum = Integer.parseInt(in.nextLine());
					break;
				} catch (Exception e) {
					System.out.println(ANSI_RED + "Invalid response: Please enter a whole number." + ANSI_RESET);
				}
			}
			while (true) {
				try {
					System.out.println("Please enter the ending number:  ");
					endNum = Integer.parseInt(in.nextLine());
					break;
				} catch (Exception e) {
					System.out.println(ANSI_RED + "Invalid response: Please enter a whole number." + ANSI_RESET);
				}
			}
			while (true) {
				try {
					System.out.println("Please enter the multiplier: ");
					multiplier = Integer.parseInt(in.nextLine());
					break;
				} catch (Exception e) {
					System.out.println(ANSI_RED + "Invalid response: Please enter a whole number." + ANSI_RESET);
				}
			}

			for(int i = startNum; i <= endNum; i++) {

				System.out.println("Multiplying "+i+" by "+multiplier+"  results in: "+ i*multiplier);
			}

			while (true) {
				System.out.println("Would you like to make another calculation? (Y/N)");
				String resp = in.nextLine();
				if (resp.equalsIgnoreCase("Y")) {
					break;
				} else if (resp.equalsIgnoreCase("N")) {
					keepPlay = false;
					break;
				} else {
					System.out.println(ANSI_RED + " Please answer with a 'Y' or 'N'" + ANSI_RESET);
				}

			}

		}

	}



}