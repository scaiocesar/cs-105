package week06;

import java.util.Scanner;

public class Lab6a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNum;
        int secondNum;
        int thirdNum;
        int largest;
        boolean keepPlay = true;

        while(keepPlay) {
            System.out.println("This program will ask the user for three numbers and determine which of the three is the largest.");
            firstNum = validateInputInt(in, "Enter the first number");
            secondNum = validateInputInt(in, "Enter the second number");
            thirdNum = validateInputInt(in, "Enter the third number");

            largest = largestNumber(firstNum, secondNum, thirdNum);
            System.out.println("The largest of the three numbers is: "+largest);

            keepPlay = isStillPlay(in, "Would you like to play again? (Y/N): ");
        }



    }

    public static int largestNumber(int firstNum, int secondNum, int thirdNum){
        int largest = 0;
        if (firstNum > largest) {
            largest = firstNum;
        }
        if (secondNum > largest) {
            largest = secondNum;
        }
        if(thirdNum > largest){
            largest = thirdNum;
        }
        return largest;

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
