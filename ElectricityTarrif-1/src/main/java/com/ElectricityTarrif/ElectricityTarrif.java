package com.ElectricityTarrif;


import java.util.Scanner;

class ElectricityTarrif {
    private String consumerNo;
    private String consumerName;
    private int previousMonthReading;
    private int currentMonthReading;
    private String connectionType;

    // Constructor to initialize consumer details
    public ElectricityTarrif(String consumerNo, String consumerName, int previousMonthReading, int currentMonthReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
        this.connectionType = connectionType;
    }

    // Method to calculate the bill amount
    public double calculateBill() {
        int unitsConsumed = currentMonthReading - previousMonthReading;
        double amountToBePaid = 0.0;

        // Check if the connection type is domestic
        if (connectionType.equalsIgnoreCase("domestic")) {
            if (unitsConsumed <= 100) {
                amountToBePaid = unitsConsumed * 1.0; // First 100 units: Gh. 1 per unit
            } else if (unitsConsumed <= 200) {
                amountToBePaid = 100 * 1.0 + (unitsConsumed - 100) * 2.5; // Next 100 units: Gh. 2.5 per unit
            } else if (unitsConsumed <= 500) {
                amountToBePaid = 100 * 1.0 + 100 * 2.5 + (unitsConsumed - 200) * 4.0; // Next 300 units: Gh. 4 per unit
            } else {
                amountToBePaid = 100 * 1.0 + 100 * 2.5 + 300 * 4.0 + (unitsConsumed - 500) * 6.0; // Above 500 units: Gh. 6 per unit
            }
        }
        // You can add other types of connections (e.g., commercial) if needed here
        return amountToBePaid;
    }

    // Display the bill information
    public void displayBill() {
        double billAmount = calculateBill();
        System.out.println("Electricity Bill Details:");
        System.out.println("Consumer Number: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Month Reading: " + previousMonthReading);
        System.out.println("Current Month Reading: " + currentMonthReading);
        System.out.println("Units Consumed: " + (currentMonthReading - previousMonthReading));
        System.out.println("Bill Amount: Gh. " + billAmount);
    }
}

