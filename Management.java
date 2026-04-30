import java.util.*;

interface SalesDepartment {
    void processSale(double amount);
}

interface HRDepartment {
    void conductTraining(String employeeName);
}

interface FinanceDepartment {
    void generateInvoice(double amount);
}

class Company implements SalesDepartment, HRDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale Amount: " + amount);
        System.out.println("Sale processed successfully!");
    }

    public void conductTraining(String employeeName) {
        System.out.println("Training conducted for: " + employeeName);
    }

    public void generateInvoice(double amount) {
        System.out.println("Invoice generated for amount: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Company obj = new Company();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Process Sale");
            System.out.println("2. Conduct Training");
            System.out.println("3. Generate Invoice");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Sale Amount: ");
                    double amount = sc.nextDouble();
                    obj.processSale(amount);
                    break;

                case 2:
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    obj.conductTraining(name);
                    break;

                case 3:
                    System.out.print("Enter Invoice Amount: ");
                    double amt = sc.nextDouble();
                    obj.generateInvoice(amt);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
