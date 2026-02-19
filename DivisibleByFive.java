public class DivisibleByFive {
    int number;
    void check(){
        if (number % 5 == 0)
            System.out.println(number + " is divisible by 5");
        else
            System.out.println(number + " is not divisible by 5");
    }
    public static void main(String[] args) {
        DivisibleByFive obj = new DivisibleByFive();
        obj.number = 7;
        obj.check();
    }  
}
