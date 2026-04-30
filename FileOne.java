public class PositiveNegative {
    int num;

    void check() {
        if (num > 0)
            System.out.println(num + " is positive");
        else if (num < 0)
            System.out.println(num + " is negative");
        else
            System.out.println("number is zero");
    }
    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative ();
        obj.num = -23;
        obj.check();
    }
}

