package week05;

import java.util.Scanner;

public class Lab5a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int startNum = 0;
        int endNum = 0;
        int testNum = 0;
        boolean keepPlay = true;
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";

        while (keepPlay){
            //Start the validation for STARTING NUMBER
            while (true) {
                try{
                    // Prompt user for enter the starting number
                    System.out.println("Enter the starting number: ");
                    // read the input
                    startNum = Integer.parseInt(in.nextLine());
                    // if input is integer we will break the loop and keep going to the next while
                    break;
                }catch (Exception e){
                    // if we came here it means the input is not a number, so we will ask for a whole number
                    System.out.println(ANSI_RESET+"Error: Please enter a whole number."+ANSI_RED);
                }
            }//END the validation for STARTING NUMBER

            while (true) {
                try{
                    System.out.println("Enter the ending number: ");
                    endNum = Integer.parseInt(in.nextLine());
                    break;
                }catch (Exception e){
                    System.out.println(ANSI_RESET+"Error: Please enter a whole number."+ANSI_RED);
                }
            }

            while (true) {
                try{
                    System.out.println("Enter the test number: ");
                    testNum = Integer.parseInt(in.nextLine());
                    break;
                }catch (Exception e){
                    System.out.println(ANSI_RESET+"Error: Please enter a whole number."+ANSI_RED);
                }
            }

            System.out.println("Here are the numbers between "+startNum+" and "+endNum+" that are divisible by "+testNum+":");

            for (int i = startNum; i <= endNum; i++) {
                int result = i % testNum;
                if(result == 0){
                    System.out.println(i);
                }

            }

            while (true) {
                System.out.println("Would you like to play again?");
                String resp = in.nextLine();
                if(resp.equalsIgnoreCase("Y")){
                    break;
                } else if (resp.equalsIgnoreCase("N")) {
                    keepPlay = false;
                    break;
                }else{
                    System.out.println(ANSI_RESET+" Please answer with a 'Y' or 'N'"+ANSI_RED);
                }

            }

        }

    }




}
