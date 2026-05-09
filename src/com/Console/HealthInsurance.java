package com.Console;

public class HealthInsurance extends Customer {

    public double calculatePremium(int age, boolean hasDisease) {

        double premium = 3000;

        if (age > 45) {
            premium += 1500;
        }

        if (hasDisease) {
            premium += 2000;
        }

        return premium;
    }

    public static void main(String[] args) {

        HealthInsurance hi = new HealthInsurance();

        int age = hi.getCustomerAge();
        boolean disease = hi.hasDisease();

        boolean docsValid = hi.isValidAadhaar() && hi.isValidPhone();

        boolean eligible = age >= 18;

        if (docsValid && eligible) {
            System.out.println("Health Insurance Approved");

            double premium = hi.calculatePremium(age, disease);
            System.out.println("Premium: " + premium);
        } else {
            System.out.println("Health Insurance Rejected");
        }
    }

    boolean hasDisease() {
        System.out.println("Any pre-existing disease? (true/false):");
        return sc.nextBoolean();
    }
}
