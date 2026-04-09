// Interface
interface Gross {
    double calculateGross();
}

// Base class
class Employee {
    String name;
    int empId;
    double basicSalary;

    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Child class
class Salary extends Employee implements Gross {
    double hra;
    double da;

    Salary(String name, int empId, double basicSalary, double hra, double da) {
        super(name, empId, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    // Implementing interface method
    public double calculateGross() {
        return basicSalary + hra + da;
    }

    void displaySalary() {
        displayEmployee();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGross());
    }
}

// Main class
public class Gross {
    public static void main(String[] args) {
        Salary emp = new Salary("Rahul", 101, 30000, 5000, 3000);
        emp.displaySalary();
    }
}
