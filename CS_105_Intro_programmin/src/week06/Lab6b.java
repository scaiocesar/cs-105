package week06;

import java.util.Scanner;

public class Lab6b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNum;
        int secondNum;

        boolean keepPlay = true;

        while(keepPlay) {
            System.out.println("This program will ask the user for 2 numbers and raise the first number to the power of the second.");
            firstNum = validateInputInt(in, "Please enter the first number:");
            secondNum = validateInputInt(in, "Please enter the second number: ");

            System.out.println(firstNum+" raised to the power of "+secondNum+" is: "+power(firstNum,secondNum)+" .");

            keepPlay = isStillPlay(in, "Would you like to play again? (Y/N): ");
        }



    }

    public static int power(int num1, int num2){
        int pow = 1;
        for(int i = 0; i < num2; i++) {
            pow = pow * num1;
        }
        return pow;

    }

    public static int validateInputInt(Scanner in, String prompt) {
        int number = 0;
        while (true) {
            try {
                System.out.print(prompt);
                number = Integer.parseInt(in.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid response: Please enter a whole number." );
            }
        }
        return number;
    }

    public static boolean isStillPlay(Scanner in, String prompt) {
        while (true) {
            System.out.print(prompt);
            String resp = in.nextLine();
            if (resp.equalsIgnoreCase("Y")) {
                return true;
            } else if (resp.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println(" Please answer with a 'Y' or 'N'");
            }
        }
    }


}