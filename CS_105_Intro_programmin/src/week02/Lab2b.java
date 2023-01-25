package week02;

import java.util.Scanner;

public class Lab2b {
    public static void main(String[] args) {

        String answer;
        int sqWidth;
        int recWidth;
        int recHeight;
        int sqArea;
        int recArea;
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter the width of the square:");
        answer = in.nextLine();
        sqWidth = Integer.parseInt(answer);

        System.out.println("Please enter width of the rectangle:");
        answer = in.nextLine();
        recWidth = Integer.parseInt(answer);

        System.out.println("Please enter height of the rectangle:");
        answer = in.nextLine();
        recHeight = Integer.parseInt(answer);


        sqArea = sqWidth * 2;
        recArea =  recWidth * recHeight;

        System.out.println("The area of a square with a width of " +sqWidth+ " is " +sqArea );
        System.out.println("The area of a rectangle with a width of " +recWidth+ " and a height of "+recHeight+ " is " +recArea);



    }
}
