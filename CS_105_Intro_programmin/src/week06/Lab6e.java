package week06;

import java.util.Scanner;

public class Lab6e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = "";

        boolean keepPlay = true;

        while(keepPlay) {
            System.out.println("This program will ask the user to enter something and then print out a reversed version of the user's input.");
            inputStr = in.nextLine();
            System.out.printf("Using the for loop: The reverse of '%s' is: %s%n",inputStr,forReverse(inputStr) );
            System.out.printf("Using the while loop: The reverse of '%s' is: %s%n",inputStr,whileReverse(inputStr) );

            keepPlay = isStillPlay(in, "Would you like to play again? (Y/N): ");

        }

    }


    public static String forReverse(String s){
        String result="";
        for(int i = s.length()-1; i >= 0; i --){
            result += s.charAt(i);
        }
        return result;
    }

    public static String whileReverse(String s){
        String result="";
        int i = s.length()-1;
        while (i >= 0){
            result += s.charAt(i);
            i--;
        }
        return result;
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