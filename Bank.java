import java.util.*;

e
interface Bank {
    String bankName = "State Bank";

    void displayBank();
}


class Customer {
    String custName;
    int custId;

    void getCustomerData(Scanner sc) {
        System.out.print("Enter Customer Name: ");
        custName = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        custId = sc.nextInt();
        sc.nextLine();
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + custId);
    }
}


class Account extends Customer implements Bank {
    int accNo;
    double balance;

    void getAccountData(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
    }

    void displayAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

    
    public void displayBank() {
        System.out.println("Bank Name: " + bankName);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account obj = new Account();

        System.out.println("Enter Customer Details:");
        obj.getCustomerData(sc);

        System.out.println("\nEnter Account Details:");
        obj.getAccountData(sc);

        System.out.println("\n--- Details ---");
        obj.displayBank();
        obj.displayCustomer();
        obj.displayAccount();

        sc.close();
    }
}
