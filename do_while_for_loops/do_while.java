
import java.util.Scanner;

public class do_while{
    public static void main(String[] args) {
        //WAP TO ALLOW THE USER TO ENTER THE AGE UNTIL HE DOESNOT ENTER THE VALID AGE
        //HERE DO LOOP WILL FIRST GET THE AGE IN INTEGER IRESPECTIVE IT IS NEGATIVE MORE THAN 100 OR ANY THING ELSE
        //THEN IT WILL CHECK THE CONDITION IF TRUE THEN IIT WILL EXECUTE THE DO LOOP IF FALSE THEN GET OUT OF THE LOOP 
        Scanner input=new Scanner(System.in);
        //INTIALIZER 
        int age;
        do { 
            System.out.print("PLEASE ENTER UR AGE:- ");
            age=input.nextInt();
        } while (age<0 || age>100);  //CONDITION 
        System.out.println("UR AGE IS:- " + age);
    }
}