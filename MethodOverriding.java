class animal{
    void sounds() {
        System.out.println("animal makes sounds");
    }
}
class dog extends animal{
    void sounds() {
        System.out.println("dog barks");
    }
}
    public class MethodOverriding {
        public static void main(String[] args) {
            animal obj = new dog();
            obj.sounds();
        }
    
}
