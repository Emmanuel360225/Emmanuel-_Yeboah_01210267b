

package com.ElectricityTarrif;
import java.util.Scanner;

public class electricityBillCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter Consumer Number: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int previousMonthReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currentMonthReading = scanner.nextInt();

        // Clear the scanner buffer
        scanner.nextLine();

        System.out.print("Enter Type of EB Connection (domestic/commercial): ");
        String connectionType = scanner.nextLine();

        // Create an object of ElectricityBill class and calculate the bill
        ElectricityTarrif bill = new ElectricityTarrif(consumerNo, consumerName, previousMonthReading, currentMonthReading, connectionType);
        bill.displayBill();

        scanner.close();
    }
}