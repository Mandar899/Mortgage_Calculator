package com.mark;

import java.text.NumberFormat;

public class MortgageReport {
    //PRIVATE FIELDS
    private final NumberFormat currency;
    private MortgageCalculator calculator;

    //CONSTRUCTOR
    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    //PRINTS PAYMENT SCHEDULE
    public void printPaymentSchedule() {
        System.out.println("\n" + "PAYMENT SCHEDULE" + "\n" + "-------------------");
        for(double balance: calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

    //PRINTS MORTGAGE
    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("\n" + "MORTGAGE" + "\n" + "-------------------" + "\n" + "Mortgage: " + mortgageFormatted);
    }
}
