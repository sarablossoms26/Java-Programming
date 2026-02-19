public class FileThree {
   int a,b;
    void display (){
        System.out.println("a = " +a);
        System.out.println("b = " + b);
    }
    void swap() {
        int c = a;
        a = b;
        b = c;
    } 
    public static void main(String[] args) {
        FileThree obj = new FileThree();
        obj.a=10;
        obj.b=20;
        obj.display();
        obj.swap();
        obj.display();
    } 
}
