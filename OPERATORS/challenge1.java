
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        

        System.out.println("CALCAULTE PRODUCT OF TWO doubleING PINTS NUMBERS");
        float c=10.0F;
        float d=20.0F;
        System.out.println(c*d);

        System.out.println("PERIMETER OF A RECTANGLE");
        System.out.println("PERIMETER OF A RECTANGLE"+(a+b+c+d));

        System.out.println("CALCULATE AREA OF TRIANGLE");
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER:- ");
        double breadth=input.nextDouble();
        System.out.print("ENTER SECOND NUMBER:- ");
        double height=input.nextDouble();
        double ans1=0.5*breadth*height;
        double ans2=(breadth*height)/2;
        System.out.println("AREA OF TRIANGLE=> "+ans1); 
        System.out.println("AREA OF TRIANGLE=> "+ans2); 

        System.out.println("CALCULATE SIMPLE INTEREST");
        System.out.print("ENTER FIRST P:- ");
        int Principle=input.nextInt();
        System.out.print("ENTER SECOND T:- ");
        double Time=input.nextDouble();
        System.out.print("ENTER THIRD R:- ");
        double Rate=input.nextDouble();
        System.out.println("SIMPLE INTEREST"+((Principle*Time*Rate)/100));

        System.out.println("COMPOUND INTEREST");
        //MATH.POWER RETURN VALUE IN DOUBLE
        //Math.pow(3,2) MEANS 3 RAISED TO 2 THAT IS 9
        double value=Math.pow((1+Rate/100),Time);
        double compoundInterst=Principle*value;
        System.out.println("COMPUND INTEREST"+compoundInterst);

        System.out.println("PROGRAM TO CONVERT FAHRENHEIT TO CELSIUS");
        System.out.println("PLEAS GIVE IN FARAHANITE:-");
        double farh=input.nextDouble();
        double degreecel=(farh-32)*5/9;
        System.out.println("DEGREE CELSIUS:-"+degreecel);

        //IF WE SEE 1/2 RETURNS ONLY 0
        //BUT IF I WANT WHOLE ANSWER IN FLOAT WE NEED TO DIVIDE 1F/2F WHICH WILL GIVE ANSWR IN 0.5
        







    }   
}
