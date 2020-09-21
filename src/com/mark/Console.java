package com.mark;
import java.util.Scanner;

public class Console {

    //SCANS THE INPUT GIVEN BY THE USER
    private static final Scanner scan = new Scanner(System.in);

    //DATA VALIDATION METHOD
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = scan.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;

    }
}
