
import java.util.Scanner;

public class ternary_operator{
    public static void main(String[] args) 
    {
        //TERNAR OPERATOR IS A SUBSTIUTE FOR IF ELSE LOOP
        //int variablename=conditon?value_u_need_to_use_if_condition is true:value_u_need_to_use_if_condition is false
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER:-");
        int num1=input.nextInt();
        System.out.print("ENTER SECOND NUMBER:-");
        int num2=input.nextInt();

        //TERNARY OPERATOR
        int greater_value;
        greater_value=num1>num2?num1:num2;
        System.out.println("BIGGER VALUE:-" + greater_value);
    }
}