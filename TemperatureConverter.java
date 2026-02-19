class TemperatureConverter {
    double celsius;
    void convert(){
        double fahrenheit = (celsius*9/5)+32;
        System.out.println("temperature in fahrenheit =" + fahrenheit);
    }
    public static void main(String[] args) {
        TemperatureConverter obj = new TemperatureConverter();
        obj.celsius = 37;
        obj.convert();
    }
}