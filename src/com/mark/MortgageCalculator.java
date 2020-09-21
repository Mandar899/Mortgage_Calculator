package com.mark;

public class MortgageCalculator {

    //PRIVATE FINAL FIELDS
    private final static int monthsInYear = 12;
    private final static int percent = 100;

    //PRIVATE FIELDS
    private  int principal;
    private  float rate;
    private  short period;

    //CONSTRUCTOR
    public MortgageCalculator(int principal, float rate, short period) {
        this.principal = principal;
        this.rate = rate;
        this.period = period;
    }

    //THIS METHOD RETURNS ARRAY OF CALCULATED BALANCE
    public double [] getRemainingBalances() {
        var balances = new double[getNoOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances [month-1] = calculateBalance(month);
        }
        return balances;
    }

    //THIS METHOD CALCULATES MORTGAGE
    public  double calculateMortgage() {
        float noOfPayments = getNoOfPayments();
        float mInterest = getmInterest();
        double mortgage = principal * (mInterest * Math.pow(1 + mInterest, noOfPayments) / (Math.pow(1 + mInterest, noOfPayments) - 1));
        return mortgage;
    }

    //THIS METHOD CALCULATES BALANCE
    public double calculateBalance(short noOfPaymentsMade) {
        float noOfPayments = getNoOfPayments();
        float mInterest = getmInterest();
        double balance = principal * (Math.pow(1 + mInterest, noOfPayments) - Math.pow(1 + mInterest, noOfPaymentsMade))
                / (Math.pow(1 + mInterest, noOfPayments) - 1);
        return balance;
    }

    //GETTERS

    private int getNoOfPayments() {
        return period * monthsInYear;
    }


    private float getmInterest() {
        return rate / percent / monthsInYear;
    }
}
