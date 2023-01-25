package week04;

import java.util.Scanner;

public class Lab4a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        boolean valid = false;

        while (!valid){
            System.out.print("Please enter a number: ");
            input = in.nextLine();
            try{
                num1 = Integer.parseInt(input);
                valid = true;
            }catch (NumberFormatException e ){
                System.out.println("Error: Please enter a whole number.\n");
            }
        }

        num2 = num1 + 1000;
        num3 = num1 * 2;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("num3 = "+num3);





    }
}
