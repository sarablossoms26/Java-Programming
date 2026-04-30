import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String result = str.replace('d', 'f');

        System.out.println("Modified string: " + result);
    }
}
