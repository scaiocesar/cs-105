package week08;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab8b {
   static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program will ask the user to enter a series of numbers.\n" +
                "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\n" +
                "The program will then display the array of numbers and the sum total of those numbers.");
       Boolean keepPlay = true;

       while(keepPlay) {
           ArrayList<Integer> numbers = new ArrayList<>();
           Integer number;
           while (true) {
               try {
                   System.out.print("Please enter a number (or just hit enter to finish): ");
                   String inputStr = in.nextLine();
                   if (!inputStr.isEmpty()) {
                       numbers.add(Integer.parseInt(inputStr)) ;
                   } else {
                       break;
                   }
               } catch (Exception e) {
                   System.out.println("Please enter a whole number for the birth year.");
               }

           }
           Integer totalSum = sumValues(numbers);
           System.out.println("There are "+numbers.size()+" items in the ArrayList.");
           System.out.println("The sum total of numbers in the ArrayList is "+ totalSum);

           System.out.println("Duplicated "+ dups(numbers));


           keepPlay = isStillPlay(in, "Would you like to play again? (Y/N): ");

       }

    }

    public static Integer sumValues(ArrayList<Integer> numbers){
        Integer sum = 0;
        System.out.println("Array Index      Item");
        for (int i = 0; i < numbers.size() ; i++) {
            System.out.println(i + "      "+numbers.get(i));
            sum += numbers.get(i);
        }
        return sum;
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
    
    public static ArrayList<Integer> dups(ArrayList<Integer> arr){
        ArrayList<Integer> dups = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            if(arr.subList(i+1,arr.size()).contains(arr.get(i)) && !dups.contains(arr.get(i))){
                dups.add(arr.get(i));
            }
        }

        return dups;

    }


}
