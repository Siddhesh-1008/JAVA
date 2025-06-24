
import java.util.Scanner;

public class simple_calc{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER:- ");
        int num1=input.nextInt();
        System.out.print("ENTER THE SECOND NUMBER:- ");
        int num2=input.nextInt();
        System.out.print("ENTER THE OPERATION:- ");
        String str=input.next();

        int calc_value=calc(num1,num2,str);
        System.out.println("BASED ON OPERATION UR RESULT IS:- " + calc_value);
    }

    public static int calc(int num1,int num2,String str){
        int val=switch(str){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "/" -> num1/num2;
            case "*" -> num1*num2;
            default -> -1;
        };
        return val;

    }
}