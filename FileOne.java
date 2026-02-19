public class FileOne {
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
        FileOne obj = new FileOne();
        obj.num = -23;
        obj.check();
    }
}

