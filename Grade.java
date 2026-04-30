public class FileFive {
  int percent; 
    void grade(){
        if(percent>= 90)
            System.out.println("GRADE:A");
        else if(percent>= 80 && percent<= 90)
            System.out.println("GRADE:B");
        if(percent>= 70 && percent<= 80)
            System.out.println("GRADE:C");
        if(percent>= 60 && percent<= 70)
            System.out.println("GRADE:D");
        if(percent>= 40 && percent<= 60)
            System.out.println("GRADE:E");
        else 
            System.out.println("GRADE:F");
    }  
    public static void main(String[] args) {
        FileFive obj = new FileFive();
        obj.percent = 85;
        obj.grade();
    }
}
