public class AreaOverloading {
    void area(int side){
        System.out.println("area of the square: " + (side*side));
    }
    void area(int length,int width)
    {
        System.out.println("area of the rectangle: " + (length*width));
    }void area(double rad)
    {
        System.out.println("area of the circle: " + (3.14*rad*rad));
    }  
    public static void main(String[] args) {
        AreaOverloading obj = new AreaOverloading();
        obj.area(5);
        obj.area(2, 6);
        obj.area(8.9);
    }
}
