public class OuterClass {
    int n = 123;
    class InnerClass extends OuterClass {
        void Display(){
            System.out.println("the number is " +n);
        }
    }
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        OuterClass.InnerClass obj2 = obj1. new InnerClass();
        obj2.Display();
    }
}
