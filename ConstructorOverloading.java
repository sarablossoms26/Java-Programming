public class ConstructorOverloading {
    int roll;
    String name;

    public ConstructorOverloading() {
        roll = 0;
        name = "noname";
    }

    public ConstructorOverloading(int r, String n) {
        this.roll = r;
        this.name = n;
    }
    void Display(){
        System.out.println("roll:" + roll + "name:" + name);
        ConstructorOverloading s1 = new ConstructorOverloading();
        ConstructorOverloading s2 = new ConstructorOverloading(101,"nafi");
        ConstructorOverloading s3 = new ConstructorOverloading(123,"safi");
        s1.Display();
        s2.Display();
        s3.Display();
    }
}
