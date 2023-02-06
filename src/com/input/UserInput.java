package com.input;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Currency;
import java.math.BigDecimal;
public class UserInput {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);

        System.out.println("Enter any String Value:  ");
        String strum = reader.nextLine();

        System.out.println("Enter any Integer Value:  ");
        int inum = reader.nextInt();

        System.out.println("Enter any Boolean Value:   ");
        Boolean bbum = reader.nextBoolean();


        System.out.println("Enter any Double Value:   ");
        double ddum = reader.nextDouble();

        System.out.println("Enter any Floating-Point Value:   ");
        float flum = reader.nextFloat();

        System.out.println("Enter any Long Value:   ");
        Long lum = reader.nextLong();

        System.out.println("Enter any BigDecimal Value:  ");
        BigDecimal bdum = reader.nextBigDecimal();

        System.out.println("Enter any Dollar amount:  ");
        Double dddd = reader.nextDouble();
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();


     System.out.println("String = " + strum);
     System.out.println("Integer = " + inum);
     System.out.println("Boolean = " + bbum);
     System.out.println("Double = " + ddum);

     System.out.println("Float = " + flum);
     System.out.println("Long =  " + lum);
     System.out.println("BigDecimal = " + bdum);
     System.out.println("Currency = " + dddd);
     System.out.println("But in USD:  " + defaultFormat.format(dddd));

    }
}