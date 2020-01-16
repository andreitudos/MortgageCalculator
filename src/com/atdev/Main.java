package com.atdev;

import javax.swing.plaf.synth.SynthInternalFrameUI;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
       String[] fruits = {"Apple","Mango","Orange"};

       for (int i = 0; i<fruits.length; i++)
        System.out.println(fruits[i]);

        for (String fruit: fruits) {
            System.out.println(fruit);
        }

*/

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        Scanner scanner = new Scanner(System.in);
        float rate = 0;
        int numberOfPayments = 0;

        while(true){
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if(principal>=1000 && principal <= 1_000_000)
            break;
            System.out.println("Enter a number between 1000 and 1000000: ");
        }

        while (true){
            System.out.println("Annual Interest Rate: ");
            float anualRate = scanner.nextFloat();
            if (anualRate >=1 && anualRate<=30){
                rate = anualRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal of 30: ");
        }

        while (true){
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if(years >=1 && years <=30){
                numberOfPayments =  years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        double mortgage = principal
                *((rate*(float)(Math.pow((1+rate),numberOfPayments)))/((Math.pow((1+rate),numberOfPayments))-1));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage) );

    }
}
