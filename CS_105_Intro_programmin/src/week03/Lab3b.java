package week03;

import java.util.Scanner;

public class Lab3b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double heightIn = 0.0;
        Double wheightLb = 0.0;

        Double heightM = 0.0;
        Double wheightKg = 0.0;

        Double bmi = 0.0;


        System.out.println("Please enter a person's height in inches:");
        heightIn = in.nextDouble();

        System.out.println("Please enter a person's wheight in pounds:");
        wheightLb = in.nextDouble();

        //Lets convert to the metrical system
        heightM = 0.0254 * heightIn;
        wheightKg = 0.45359237 * wheightLb;

        bmi = wheightKg/(heightM * heightM);

        if (bmi < 18.5) {
            System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Normal");
        } else if (bmi >= 25.0 && bmi < 29.9) {
            System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Overweight");
        } else
            System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Obese");
    }

}



