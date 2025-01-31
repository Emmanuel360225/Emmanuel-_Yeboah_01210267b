package com.ElectricityBillCalculator;

public class ElectricityBillCalculator {
    public static double calculateCommercialBill(int units) {
        double amount = 0;

        if (units <= 100) {
            amount = units * 2.0;
        } else if (units <= 200) {
            amount = (100 * 2.0) + ((units - 100) * 4.50);
        } else if (units <= 500) {
            amount = (100 * 2.0) + (100 * 4.50) + ((units - 200) * 6.0);
        } else {
            amount = (100 * 2.0) + (100 * 4.50) + (300 * 6.0) + ((units - 500) * 7.0);
        }

        return amount;
    }

    public static void main(String[] args) {
        int unitsConsumed = 550; // Example input
        double billAmount = calculateCommercialBill(unitsConsumed);

        System.out.println("Electricity Bill for " + unitsConsumed + " units: Gh. " + billAmount);
    }
}
