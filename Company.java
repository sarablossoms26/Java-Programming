import java.util.*;

class Tender {
    double cost;
    String company;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        company = sc.nextLine();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
        sc.nextLine();
    }
}

public class Main {
    public static void main(String[] args) {
        Tender[] t = new Tender[5];

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("Enter details for Tender " + (i + 1));
            t[i].input();
        }

        double min = t[0].cost;
        String company = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                company = t[i].company;
            }
        }

        System.out.println("Company with minimum cost: " + company);
    }
}
