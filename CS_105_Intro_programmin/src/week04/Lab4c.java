package week04;

import java.util.Scanner;

public class Lab4c {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int range = max-min+1;
        int guess = 0;
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";

        System.out.println("This program is a guessing game.\n" +
                "The computer will generate a random integer between 1 and 100. The user will try to guess the number.\n" +
                "Let's get started!");

        while(true) {

            System.out.println("I'm thinking of a number between 1 and 100.");
            int randNum = (int)(Math.random() * range) + min;
            System.out.println("###DEBUG####"+randNum);
            System.out.println("What is your guess?");


            int count = 0;
            while (true) {
                count++;
                while (true) {
                    try {
                        guess = Integer.parseInt(in.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print(ANSI_RED+"Please enter a whole number."+ANSI_RESET);

                    }
                }

                if (guess < randNum) {
                    System.out.println("Your guess is too low");
                } else if (guess > randNum) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("CORRECT! You guessed it in " + count + " tries!!");
                    break;
                }
            }

            while (true) {
                System.out.print("Would you like to play again? Y/N ");
                String playAgain ="";
                playAgain = in.nextLine();
                if ("N".equalsIgnoreCase(playAgain)) {
                    System.exit(1);
                }else if("Y".equalsIgnoreCase(playAgain)){
                    break;
                }else{
                    System.out.println(ANSI_RED+"Please enter Y or N"+ANSI_RESET);
                }
            }

        }

    }


}
