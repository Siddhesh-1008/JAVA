
import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        //DISCOUNT CALCULATOR
        //75 percent for age<5 and for female give 50 percent and age>60 nad is not equal to fremale then give 25 percent
        //WHILE COMPARING WE MUST GO FROM HIGH TO LOW VALUES
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE AGE...");
        int age=input.nextInt();
        System.out.print("ARE U A FEMALE(TRUE OR FALSE)");
        boolean isFemale=input.nextBoolean();
        if(age<5){
            System.out.println("GIVE 75 PERCENT DISCOUNT");
        }
        else if(isFemale){
            System.out.println("U GOT 50 PERCENT");
        }
        else if(age>60 && !isFemale){
            System.out.println("GIVE 25 PERCENT DISCOUNT...");
        }   
        else{
            System.out.println("SORRY U HAD ENTER SOMETHING WRONG..");
        }
    }
}
