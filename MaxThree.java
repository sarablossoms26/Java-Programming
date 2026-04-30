public class FileTwo {
    int a,b,c;
    void max(){
        if(a > b && a > c) 
            System.out.println("maximum is " + a);
        else if(b > a && b > c)
            System.out.println("maximum is " + b);
        else
            System.err.println("maximum is " + c);
    }
    public static void main(String[] args) {
        FileTwo obj = new FileTwo();
        obj.a = 16;
        obj.b = 20;
        obj.c = 56;
        obj.max();
    }
    
}
