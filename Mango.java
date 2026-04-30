import java.util.*;


interface Mango {
    void taste();
    void season();
}

class Winter implements Mango {

    public void taste() {
        System.out.println("Winter Mango: Sweet and less juicy.");
    }

    public void season() {
        System.out.println("Available in Winter season.");
    }
}

class Summer implements Mango {

    public void taste() {
        System.out.println("Summer Mango: Very sweet and juicy.");
    }

    public void season() {
        System.out.println("Available in Summer season.");
    }
}

public class Main {
    public static void main(String[] args) {

        Mango m1 = new Winter();
        Mango m2 = new Summer();

        System.out.println("--- Winter Mango ---");
        m1.taste();
        m1.season();

        System.out.println("\n--- Summer Mango ---");
        m2.taste();
        m2.season();
    }
}
