/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Umran Jameel
 */

import java.util.*;

public class Exercise13 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        String prin = in.nextLine();
        double principal = Double.parseDouble(prin);

        System.out.print("What is the rate? ");
        String ra = in.nextLine();
        double rate = Double.parseDouble(ra);
        rate /= 100;

        System.out.print("What is the number of years? ");
        String year = in.nextLine();
        double years = Double.parseDouble(year);

        System.out.print("What is the number of times the interest is compounded per year? ");
        String ti = in.nextLine();
        double times = Double.parseDouble(ti);

        double exponent = times * years;
        double total = principal * (Math.pow((1 + (rate / times)), exponent));

        System.out.printf("$%.2f invested at %.2f for %.0f years compunded %.0f times per year is %.2f.", principal, rate * 100, years, times, total);
    }
}
