import java.util.Scanner ;
import jdk.jshell.SourceCodeAnalysis;
interface Bank {
    String bank_name = "State Bank of India" ;
    void showBankDetails();
}
class Customer {
    String customer_name;
    int acc_number;
    void coustomerdetails (String name,int acc){
        customer_name = name;
        acc_number = acc;
    }
}
class Account extends Customer implements Bank{
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    void showBankDetails(){
        System.out.println("Bank Name:"+ bank_name );
    }
    void deposit (double amount) {
        balance += amount;
        System.out.println("Deposited:" + amount);
    }
    void withdraw (double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn:" + amount );
        }
        else{
            System.out.println("Insufficient Amount!");
        }
    }
    void display(){
        System.out.println("ACCOUNT DETAILS");
        System.out.println();
    }
}