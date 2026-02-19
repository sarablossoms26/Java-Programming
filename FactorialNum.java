class FactorialNum{
  int n;
void Factorial(){
 int fact =1;
 for(int i=1; i<=n; i++){
       fact=fact*i;
    }
    System.out.println("Factorial is:"+ fact);
  }
public static void main(String[]args){
    FactorialNum obj=new FactorialNum();
    obj.n = 10;
    obj.Factorial();
 }
}