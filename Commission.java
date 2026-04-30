import java.util.Scanner;

class Commission {
    String name;
    double sales, commission;

    Commission(String n, double s) {
        name = n;
        sales = s;
    }

    void calculate() {
        if (sales >= 100000)
            commission = sales * 0.1;
        else if (sales >= 50000)
            commission = sales * 0.05;
        else
            commission = sales * 0.02;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Sales: " + sales);
        System.out.println("Commission: " + commission);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();

        Commission c = new Commission(name, sales);
        c.calculate();
        c.display();

        sc.close();
    }
}
