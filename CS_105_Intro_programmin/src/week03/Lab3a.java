package week03;

import java.util.Scanner;

public class Lab3a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer size = 0;

        System.out.println("Please enter the customer's chest measurement in inches:");
        size = in.nextInt();

        if(size < 38){
            System.out.println("A customer with a chest measurement of "+size+" inches needs to order a size S.");
        }else if(size >= 38 && size < 40){
            System.out.println("A customer with a chest measurement of "+size+" inches needs to order a size M.");
        }else if(size >= 40 && size < 43) {
            System.out.println("A customer with a chest measurement of " + size + " inches needs to order a size L.");
        }else if(size >= 43 && size < 46) {
            System.out.println("A customer with a chest measurement of " + size + " inches needs to order a size XL.");
        }else{
            System.out.println("A customer with a chest measurement of " + size + " inches needs to order a size XXL.");
        }




    }
}
