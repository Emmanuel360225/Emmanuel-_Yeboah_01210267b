package com.mycompany.employee;

/**
 * Base Employee Class
 */
class Employee {
    String empName;
    int empId;
    String address;
    String mailId;
    String mobileNo;
    double basicPay;

    public Employee(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public double calculateDA() {
        return 0.97 * basicPay;
    }

    public double calculateHRA() {
        return 0.10 * basicPay;
    }

    public double calculatePF() {
        return 0.12 * basicPay;
    }

    public double calculateStaffClubFund() {
        return 0.001 * basicPay;
    }

    public double calculateGrossSalary() {
        return basicPay + calculateDA() + calculateHRA();
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF() - calculateStaffClubFund();
    }

    public void generatePaySlip() {
        System.out.println("---- Pay Slip ----");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + calculateDA());
        System.out.println("HRA: " + calculateHRA());
        System.out.println("PF: " + calculatePF());
        System.out.println("Staff Club Fund: " + calculateStaffClubFund());
        System.out.println("Gross Salary: " + calculateGrossSalary());
        System.out.println("Net Salary: " + calculateNetSalary());
        System.out.println("----------------");
    }
}

/** Subclasses **/
class Programmer extends Employee {
    public Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class Professor extends Employee {
    public Professor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

/** Main Application **/
class EmployeeApp {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Alice", 101, "Accra", "alice@example.com", "0244123456", 5000);
        programmer.generatePaySlip();

        AssistantProfessor professor = new AssistantProfessor("Bob", 202, "Kumasi", "bob@example.com", "0555678901", 8000);
        professor.generatePaySlip();
    }
}

