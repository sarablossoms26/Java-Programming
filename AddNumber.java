 class AddNumber {
     int a,b;
    void add(){
        int sum = a+b;
        System.out.println("sum =" +sum);
    }
    public static void main(String[] args) {
        AddNumber obj = new AddNumber();
        obj.a = 10; 
        obj.b = 20;
        obj.add();
    }
}
