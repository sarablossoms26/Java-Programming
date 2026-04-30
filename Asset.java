import java.util.Scanner;

abstract class Asset {
    String descriptor;
    String date;
    double currentValue;

    Asset(String descriptor, String date, double currentValue) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
    }

    abstract void displayDetails();
}

class Stock extends Asset {
    int numShares;
    double sharePrice;

    Stock(String descriptor, String date, double currentValue, int numShares, double sharePrice) {
        super(descriptor, date, currentValue);
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    void displayDetails() {
        System.out.println("Stock Details");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Number of Shares: " + numShares);
        System.out.println("Share Price: " + sharePrice);
        System.out.println("Asset Value: " + (numShares * sharePrice));
    }
}

class Bond extends Asset {
    double interestRate;

    Bond(String descriptor, String date, double currentValue, double interestRate) {
        super(descriptor, date, currentValue);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("Bond Details");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Asset Value: " + (currentValue + (currentValue * interestRate / 100)));
    }
}

class Savings extends Asset {
    double interestRate;

    Savings(String descriptor, String date, double currentValue, double interestRate) {
        super(descriptor, date, currentValue);
        this.interestRate = interestRate;
    }

    void displayDetails() {
        System.out.println("Savings Details");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Asset Value: " + (currentValue + (currentValue * interestRate / 100)));
    }
}

class AssetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Stock Details:");
        String sd = sc.nextLine();
        String sdate = sc.nextLine();
        double sval = sc.nextDouble();
        int shares = sc.nextInt();
        double price = sc.nextDouble();
        sc.nextLine();

        Stock stock = new Stock(sd, sdate, sval, shares, price);

        System.out.println("Enter Bond Details:");
        String bd = sc.nextLine();
        String bdate = sc.nextLine();
        double bval = sc.nextDouble();
        double bir = sc.nextDouble();
        sc.nextLine();

        Bond bond = new Bond(bd, bdate, bval, bir);

        System.out.println("Enter Savings Details:");
        String savd = sc.nextLine();
        String savdate = sc.nextLine();
        double savval = sc.nextDouble();
        double savir = sc.nextDouble();

        Savings savings = new Savings(savd, savdate, savval, savir);

        System.out.println();
        stock.displayDetails();
        System.out.println();
        bond.displayDetails();
        System.out.println();
        savings.displayDetails();

        sc.close();
    }
}
