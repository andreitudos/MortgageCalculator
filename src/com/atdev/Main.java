package com.atdev;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.print("Principal: ");
        int principal = new Scanner(System.in).nextInt();

        System.out.println("Annual Interest Rate: ");
        float anualRate = new Scanner(System.in).nextFloat();

        double r = anualRate / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years): ");
        byte years = new Scanner(System.in).nextByte();

        int payments =  years * MONTHS_IN_YEAR;

        double mortgage = principal
                *((r*(float)(Math.pow((1+r),payments)))/((Math.pow((1+r),payments))-1));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage) );

    }
}
