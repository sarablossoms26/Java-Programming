public class FileSeven {
   int n;
   void print(){ 
    int a=0 ,b=1 ,c;
    System.out.print("fibomanacci series:" +a+""+b);
    for(int i= 2;i<n;i++){
        c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
    }
   } 
   public static void main(String[] args) {
        FileSeven obj = new FileSeven();
        obj.n = 23;
        obj.print();
    }
}
