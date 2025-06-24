public class Lec3 {
  public static void main(String[] args){
    // VARIABLES
    int x=15;
    int y=10;
    int sum=x+y;
    System.out.println(sum);
    // SEE THE OUPTUT OF DIFFERENT OPERATIONS
    int v1=x/y;
    int v2=y/x;
    int v3=x%y;
    System.out.println(v1 +","+ v2 +","+v3);

    // EVALUATION OF EXPRESSIONS
    // *,/,% IS GREATER THAN +,-
    int exp= (x *y) /(x + y);
    System.out.print(exp);
  }
}
