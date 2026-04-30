import java.util.*;
e
interface Gross {
    double calculateGross();
}

class Employee {
    String empName;
    int empId;

    void getEmployeeData(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
    }
}

class Salary extends Employee implements Gross {
    double basic, hra, da;

    void getSalaryData(Scanner sc) {
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();
    }

    public double calculateGross() {
        return basic + hra + da;
    }

    void displaySalary() {
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Salary s = new Salary();

        System.out.println("Enter Employee Details:");
        s.getEmployeeData(sc);

        System.out.println("\nEnter Salary Details:");
        s.getSalaryData(sc);

        System.out.println("\n--- Employee Salary Details ---");
        s.displayEmployee();
        s.displaySalary();

        sc.close();
    }
}
