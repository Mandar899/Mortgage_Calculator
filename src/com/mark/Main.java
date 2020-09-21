package com.mark;

public class Main {

    public static void main(String[] args) {

        //READING INPUT FROM USER USING CONSOLE CLASS
        int principal = (int) (Console.readNumber("Principal (1K - 1M): ", 1000, 1_000_000));
        float rate = (float) Console.readNumber("Annual Interest rate: ", 1, 30);
        short period = (short) Console.readNumber("Period: ", 1, 30);

        //CREATING OBJECTS
        var calculator = new MortgageCalculator(principal,rate,period);
        var report = new MortgageReport(calculator);

        //PRINTS OUTPUT TO THE CONSOLE
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
