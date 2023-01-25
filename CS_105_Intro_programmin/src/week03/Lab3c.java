package week03;

import java.util.Scanner;

public class Lab3c {

    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            int age = 0;
            String gender = "";

            System.out.println("\n#############################################################");
            System.out.println("This program will ask a member's age and gender and determine which class they should attend on Sunday. ");
            System.out.println("Please enter the member's age: ");
            age = in.nextInt();
            if (age < 12) {
                if (age < 1) {
                    System.out.println("The member is a Babe in Arms.");
                }else if (age >= 1 && age < 3) {
                    System.out.println("The member is in Nursery.");
                } else {
                    System.out.println("The member should attend Primary.");
                }
            } else {
                System.out.println("Please enter the member's gender:    ");
                gender = in.next();
                if ((age >= 12 && age < 18) && gender.equalsIgnoreCase("M")) {
                    System.out.println("The member should attend Young Men’s.");
                } else if ((age >= 12 && age < 18) && gender.equalsIgnoreCase("F")) {
                    System.out.println("The member should attend Young Women's.");
                } else if ((age >= 18) && gender.equalsIgnoreCase("M")) {
                    System.out.println("The member should attend Priesthood.");
                } else if ((age >= 18) && gender.equalsIgnoreCase("F")) {
                    System.out.println("The member should attend Relief Society.");
                }


            }
        }
    }

}



