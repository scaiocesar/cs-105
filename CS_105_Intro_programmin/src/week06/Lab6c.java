package week06;

import java.util.Scanner;

public class Lab6c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lowNum;
        int btwnNum;
        int highNum;

        boolean keepPlay = true;

        while(keepPlay) {
            System.out.println("This program will ask the user for 3 numbers and determine if the second number lies between the first and the third.");
            lowNum = validateInputInt(in, "Please enter the low number: ");
            btwnNum = validateInputInt(in, "Please enter the number to be tested (the between number):  ");
            highNum = validateInputInt(in, "Please enter the high number:   ");

            if(isBetween( lowNum,  btwnNum,  highNum)){
                System.out.println(btwnNum+" lie between the numbers "+lowNum+" and "+highNum+".");

            }else{
                System.out.println(btwnNum+" DOES NOT lie between the numbers "+lowNum+" and "+highNum+".");
            }


            keepPlay = isStillPlay(in, "Would you like to play again? (Y/N): ");
        }



    }

    public static boolean isBetween(int num1, int num2, int num3){
        if(num2 >= num1 && num2 <= num3){
            return true;
        }else{
            return false;
        }


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