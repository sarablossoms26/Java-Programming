public class RevNum {
    int number;
    int sum=0;
    void rev(){
        int n=number;
        while(n>0){
            int a =n%10;
            sum= sum*10+a;
            n = n/10;
        }
    }
    void display(){
        System.out.println("number is "+number);
        System.out.println("reverse number is "+ sum);
    }
    public static void main(String[] args) {
        RevNum obj = new RevNum();
        obj.number=1234;
        obj.rev();
        obj.display();
    }
}
