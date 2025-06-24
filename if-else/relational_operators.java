
import java.util.Scanner;

public class relational_operators {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("PLEAS ENTER AGE..");
       int age=input.nextInt();
       if(age>=18){
            System.out.println("U CAN APPLY FOR A DRIVING LICENSE");
       }
       else{
        System.out.println("U CAN\'T APPLY FOR A DRIVING LICENSE");
       }
    }
}
