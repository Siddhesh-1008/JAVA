
import java.util.Scanner;

public class Return_function {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CALCULATOR...");
        //firstNumber() GETS THE RETURN VALUE
        int first=readNumber();
        int second=readNumber();
        int sum=first+second;
        System.out.println("UR SUM IS:-"+sum);
    }

    //THIS FUNCTION RETURN VALUE AS WE NEED TO WRITE int AS IT RETURNS VALUE
    public static int readNumber(){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBERS:-");
        int num=input.nextInt();
        return num;
    }
}
