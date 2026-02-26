public class FreqElemArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 2, 4, 5};
        boolean[] a = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (a[i])
                continue;

            int c = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                    a[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + c);
        }
    }
}
