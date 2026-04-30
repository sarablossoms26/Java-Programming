public class Main {
    public static void main(String[] args) {
        String input = String.join(" ", args);

        String[] words = input.split(" ");
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }

        System.out.println(reversed.trim());
    }
}
