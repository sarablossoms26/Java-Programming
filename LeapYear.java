public class FileFour {
    int year;
    void check(){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + "is a leap year");
        else
            System.out.println(year + "is not a leap year"); 
    }
    public static void main(String[] args) {
        FileFour obj = new FileFour();
        obj.year = 2023;
        obj.check();
    }
}
