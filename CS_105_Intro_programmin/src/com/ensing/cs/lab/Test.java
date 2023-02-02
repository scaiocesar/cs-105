package com.ensing.cs.lab;

import java.util.Date;

public class Test {
    public static void main(String[] args) {



        double t = 23.222222;
        for (int i = 0; i <= 1000; i += 100) {
            String a = Integer.toString(i);
            a += ":";
            System.out.printf("test %-10s  $%,.2f %n",a ,t += t*2 );
        }







    }






}
