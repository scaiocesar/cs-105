package week02;

import java.util.Scanner;

public class Lab2a {
    public static void main(String[] args) {

        String answer;
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter your name");
        answer = in.nextLine();
        System.out.println("Hello "+ answer+" !" + "\n");


        System.out.println("What is your favorite dessert?");
        answer = in.nextLine();
        System.out.println("I hope you like coding Java as much as you like to eat "+ answer+ "\n");

        System.out.println("Where are you from?");
        answer = in.nextLine();
        System.out.println("That's cool. I from Brazil but I think "+ answer+ " is a nice place too"+ "\n");

        System.out.println("What do you do for a living?");
        answer = in.nextLine();
        System.out.println("Oh really? "+ answer+ " is nice, but I think coding is funnier"+ "\n");

        System.out.println("What is your favorite food?");
        answer = in.nextLine();
        System.out.println("I'm not a big fan af "+ answer+ ". I like a good brazilian churrasco bbq, you have to try it! "+ "\n");

        System.out.println("What is your favorite drink?");
        answer = in.nextLine();
        System.out.println(" "+ answer+ "???? . I never heard about it before "+ "\n");

        System.out.println("What is a good password for you?");
        answer = in.nextLine();
        System.out.println("Humm, "+ answer+ "is ok! But please don't use \"beef stew\" as a computer password. It's not stroganoff."+ "\n");

        System.out.println(" ________________________________________\n" +
                "/ It was a pleasure to talk to you but I \\\n" +
                "| bit tired now and I need to take a     |\n" +
                "\\ rest! See you soon                     /\n" +
                " ----------------------------------------\n" +
                "        \\   ^__^\n" +
                "         \\  (oo)\\_______\n" +
                "            (__)\\       )\\/\\\n" +
                "                ||----w |\n" +
                "                ||     ||");


    }
}
