package week04;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        boolean isValidInput = false;
        String[] validYesAnswers = {"yes",  "si", "yep", "sim", "y", "s"};
        String[] validNoAnswers = {"no",  "nope", "no way", "nao", "n"};


        while(!isValidInput) {
            System.out.print("Do you like to code in Java?");
            input = in.nextLine().toLowerCase();
            if (Arrays.asList(validYesAnswers).contains(input)) {
                System.out.println("That's great! I do too!");
                isValidInput = true;
            } else if (Arrays.asList(validNoAnswers).contains(input)) {
                System.out.println("That's ok. There are many other wonderful things in life to learn.");
                isValidInput = true;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }


    }
}
