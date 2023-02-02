package week02;

import java.util.Scanner;

public class Lab2c {
    public static void main(String[] args) {

        String answer;
        double monthlyDeposit;
        double annualInterestRate;
        double monthlyInterestRate;
        double totalSavings;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the amount to be deposited each month:");
        answer = in.nextLine();
        monthlyDeposit = Double.parseDouble(answer);

        System.out.println("Please enter the annual interest rate percent:");
        answer = in.nextLine();
        annualInterestRate = Double.parseDouble(answer);

        monthlyInterestRate = (annualInterestRate/100) / 12;
        totalSavings = 0;

        totalSavings = monthlyDeposit * (1 + monthlyInterestRate);
        totalSavings = (monthlyDeposit+totalSavings) * (1 + monthlyInterestRate);
        totalSavings = (monthlyDeposit+totalSavings) * (1 + monthlyInterestRate);
        totalSavings = (monthlyDeposit+totalSavings) * (1 + monthlyInterestRate);
        totalSavings = (monthlyDeposit+totalSavings) * (1 + monthlyInterestRate);
        totalSavings = (monthlyDeposit+totalSavings) * (1 + monthlyInterestRate);

        System.out.printf("The ending balance after 6 months is: $ %,.2f \n",totalSavings);






    }
}
