package week05;

import java.util.Scanner;

public class Lab5b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double monthly = 0;
		double intRate = 0;
		int numMonth = 0;
		double monthlyin = 0;
		double balance = 0;

		boolean keepPlay = true;
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED = "\u001B[31m";

		while (keepPlay) {
			while (true) {
				try {
					System.out.println("Please enter the amount to be deposited each month: ");
					monthly = Double.parseDouble(in.nextLine());
					break;
				} catch (Exception e) {
					System.out.println(ANSI_RESET + "Invalid response: Please enter a whole number." + ANSI_RED);
				}
			}
			while (true) {
				try {
					System.out.println("Please enter the annual interest rate: ");
					intRate = Double.parseDouble(in.nextLine());
					break;
				} catch (Exception e) {
					System.out.println(ANSI_RESET + "Invalid response: Please enter a whole number." + ANSI_RED);
				}
			}
			while (true) {
				try {
					System.out.println("Please enter the number of months you plan to save: ");
					numMonth = Integer.parseInt(in.nextLine());
					break;
				} catch (Exception e) {
					System.out.println(ANSI_RESET + "Invalid response: Please enter a whole number." + ANSI_RED);
				}
			}
			System.out.println(
					"The following table shows the balance of the account for each month of the designated savings period.");
			System.out.println("Month              Balance");
			
			monthlyin = intRate / 100 / 12;
			
			for(int i = 1; i <= numMonth; i++) {
				
				balance = (monthly + balance) * (1 + monthlyin);
				String month = "Month "+i+":";
				System.out.printf("%-18s $%,.2f%n",month,balance);
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
					System.out.println(ANSI_RESET + " Please answer with a 'Y' or 'N'" + ANSI_RED);
				}

			}

		}

	}

}