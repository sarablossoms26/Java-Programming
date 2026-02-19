class Rectangle {
    double length,width;
    void calculate() {
        double area = length*width;
        double perimeter = 2* (length+width);
        System.out.println("area =" +area);
        System.out.println("perimeter =" + perimeter );
    }
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.length =10;
        obj.width = 5;
        obj.calculate();
    }
}