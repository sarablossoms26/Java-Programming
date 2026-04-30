import java.util.*;

// Interface Mango
interface Mango {
    void taste();
    void season();
}

// Class Winter implementing Mango
class Winter implements Mango {

    public void taste() {
        System.out.println("Winter Mango: Sweet and less juicy.");
    }

    public void season() {
        System.out.println("Available in Winter season.");
    }
}

// Class Summer implementing Mango
class Summer implements Mango {

    public void taste() {
        System.out.println("Summer Mango: Very sweet and juicy.");
    }

    public void season() {
        System.out.println("Available in Summer season.");
    }
}

// Driver Class
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
