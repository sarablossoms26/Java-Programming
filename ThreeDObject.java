import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l * b + b * h + l * h);
    }

    double volume() {
        return l * b * h;
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * 3.14 * r * (r + h);
    }

    double volume() {
        return 3.14 * r * r * h;
    }
}

class Cone extends ThreeDObject {
    double r, h, l;

    Cone(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    double wholeSurfaceArea() {
        return 3.14 * r * (r + l);
    }

    double volume() {
        return (3.14 * r * r * h) / 3;
    }
}

class ShapesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;

        System.out.println("Enter length, breadth, height for Box:");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Volume = " + obj.volume());

        System.out.println("Enter side for Cube:");
        obj = new Cube(sc.nextDouble());
        System.out.println("Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Volume = " + obj.volume());

        System.out.println("Enter radius and height for Cylinder:");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Volume = " + obj.volume());

        System.out.println("Enter radius, height and slant height for Cone:");
        obj = new Cone(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Surface Area = " + obj.wholeSurfaceArea());
        System.out.println("Volume = " + obj.volume());

        sc.close();
    }
}
