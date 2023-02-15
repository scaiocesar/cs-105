package week07;

import java.time.LocalDate;
import java.util.Scanner;

public class Lab7a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        int yob = 0 ;

        boolean keepPlay = true;

        System.out.println("This program will ask the user to enter a name and a birth year for a potential student.");
        System.out.println("The program will then determine what type of school, if any, the potential student is eligible to attend.");
        while(keepPlay) {


            System.out.print("Please enter the name of a potential student: ");
            name = in.nextLine();

            yob = validateInputInt(in,"Please enter the year the potential student was born:");

            checkEligibility(name,yob);

            keepPlay = isStillPlay(in, "Would you like to play again? (Y/N): ");
        }



    }

    public static void checkEligibility(String name, int year){
        int age = calculateAge(year);
        if(age <= 4){
            System.out.println( name+ " is "+age+" years old. "+name+" is too young to attend school.");
        } else if (age >= 5 && age <= 11) {
            System.out.println( name+ " is "+age+" years old. "+name+" may attend Elementary School");
        }else if (age >= 12 && age <= 14) {
            System.out.println( name+ " is "+age+" years old. "+name+" may attend Jr. High School");
        }else if (age >= 15 && age <= 17) {
            System.out.println( name+ " is "+age+" years old. "+name+" may attend High School");
        }else{
            System.out.println( name+ " is "+age+" years old. "+name+" may attend College");
        }
    }

    public static int calculateAge(int year){
        LocalDate currentTime = LocalDate.now();
        int currentYear = currentTime.getYear();
        int age = currentYear - year;
        return age;
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

    public static int validateInputInt(Scanner in, String prompt) {
        int number = 0;
        while (true) {
            try {
                System.out.print(prompt);
                number = Integer.parseInt(in.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Please enter a whole number for the birth year." );
            }
        }
        return number;
    }



}
