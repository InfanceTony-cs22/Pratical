import java.util.Scanner;

class Employee {
    String Emp_name, Emp_id, Address, Mail_id, Mobile_no;

    // Constructor for Employee class
    public Employee(String emp_name, String emp_id, String address, String mail_id, String mobile_no) {
        Emp_name = emp_name;
        Emp_id = emp_id;
        Address = address;
        Mail_id = mail_id;
        Mobile_no = mobile_no;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Address: " + Address);
        System.out.println("Mail ID: " + Mail_id);
        System.out.println("Mobile Number: " + Mobile_no);
    }
}

class Programmer extends Employee {
    double basicPay;

    // Constructor for Programmer class
    public Programmer(String emp_name, String emp_id, String address, String mail_id, String mobile_no, double basicPay) {
        super(emp_name, emp_id, address, mail_id, mobile_no);
        this.basicPay = basicPay;
    }

    // Calculate gross salary
    public double calculateGrossSalary() {
        return basicPay + (0.97 * basicPay) + (0.1 * basicPay) + (0.12 * basicPay);
    }

    // Calculate net salary
    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.12 * basicPay);
    }
}

// Similar classes for Assistant Professor, Associate Professor, and Professor can be created

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage for Programmer class
        System.out.println("Enter Programmer details:");
        System.out.print("Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee ID: ");
        String id = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Mail ID: ");
        String mail = scanner.nextLine();
        System.out.print("Mobile Number: ");
        String mobile = scanner.nextLine();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();

        Programmer programmer = new Programmer(name, id, address, mail, mobile, basicPay);

        System.out.println("\nProgrammer Details:");
        programmer.displayDetails();
        System.out.println("Gross Salary: " + programmer.calculateGrossSalary());
        System.out.println("Net Salary: " + programmer.calculateNetSalary());
    }
}
