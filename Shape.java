class Point {
    int x,y;

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
class Circle {
    Point p;
    double rad;
    Circle(int x,int y,double r){
        p = new Point(x,y);
        rad = r;
    }
    void display(){
        double area = Math.PI*rad*rad;
        System.out.println("Center:("+p.x+","+p.y+")");
        System.out.println("Radius:"+rad);
        System.out.println("Area:"+area);
    }
}
public class Shape{
    public static void main(String[] args) {
        Circle c = new Circle(2, 5, 8);
        c.display();
    }
}