package week07;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab7i {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //Play the game until the user says they don't want to play again.
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {
            //Get an integer from the user
            int intNum = getValidInt("Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.");
            System.out.printf("The whole number your entered was: %d.\n", intNum);
            System.out.println("Now we will test your whole number in a math equation...");
            System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
            System.out.println();

            //Get a floating-point from the user
            double doubleNum = getValidDouble("Please enter a decimal-point number: ", "Invalid response. Only decimal-point numbers are acceptable.");
            System.out.printf("The float your entered was: %f.\n", doubleNum);
            System.out.println("Now we will test your floating-point number in a math equation...");
            System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
            System.out.println();

            //Get a 'Y' or 'N' from the user
            playAgain = getValidYN("Would you like to play again? (Y/N): ", "Invalid response.  Please answer with a 'Y' or 'N'");
            System.out.println();
        }// end of while (playAgain.equalsIgnoreCase("y"))
        System.out.println("Goodbye!");
    }// end of Main()

    public static int getValidInt(String question, String warning){
        int response = 0;

        while (true) {
            try {
                System.out.print(question);
                response = Integer.parseInt(in.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(warning);
            }
        }
        return response;
    }
    public static double getValidDouble(String question, String warning){
        double response = 0;

        while (true) {
            try {
                System.out.print(question);
                response = Double.parseDouble(in.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(warning);
            }
        }
        return response;
    }

    public static String getValidYN(String question, String warning){
        while (true) {
            System.out.print(question);
            String resp = in.nextLine();
            if (resp.equalsIgnoreCase("Y")) {
                return "Y";
            } else if (resp.equalsIgnoreCase("N")) {
                return "N";
            } else {
                System.out.println(warning);
            }
        }
    }




}
