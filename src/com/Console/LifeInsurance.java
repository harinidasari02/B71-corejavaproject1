package com.Console;


public class LifeInsurance extends Customer {

    public double calculatePremium(int age, double income) {

        double premium = 2000;

        if (age > 50) {
            premium += 1000;
        }

        if (income > 500000) {
            premium += 2000;
        }

        return premium;
    }

    public static void main(String[] args) {

        LifeInsurance li = new LifeInsurance();

        int age = li.getCustomerAge();
        double income = li.getIncome();

        boolean docsValid = li.isValidAadhaar() && li.isValidPAN();

        boolean eligible = age >= 18;

        if (docsValid && eligible) {
            System.out.println("Life Insurance Approved");

            double premium = li.calculatePremium(age, income);
            System.out.println("Premium: " + premium);
        } else {
            System.out.println(" Life Insurance Rejected");
        }
    }

    double getIncome() {
        System.out.println("Enter your annual income:");
        return sc.nextDouble();
    }
}
