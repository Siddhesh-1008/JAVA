
import java.util.Scanner;

public class arthimetic_operators {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER:- ");
        int a=input.nextInt();
        System.out.println("ENTER SECOND NUMBER:- ");
        int b=input.nextInt();
        int ans1=a+b;
        int ans2=a-b;
        
        //IN DIVISON WE GET DIVSIOR AS ANSWER AND WE GET ANSWER IN INTEGER AS WE HAVE DECALRED DATAYTPE OF VARIABLE AS INT
            int ans3=a/b;
        //IN MODULUS WE GET REMAINDER AS ANSWER AND WE GET ANSWER IN INTEGER AS WE HAVE DECALRED DATAYTPE OF VARIABLE AS INT 
        //MODULUS  DOESNT WORK FOR FLOAT,DOUBLE(MEANS DECIMAL)INPUTS
            int ans4=a%b;
            System.out.println("ANS1=>"+ans1+"ANS2=>"+ans2+"ANS3=>"+ans3+"ANS4=>"+ans4);
        //ALWAYS REMEMBER THE DATATYPE THAT U DECALRED FOR A VARIBALE PLAYS A MAIN ROLE FOR UR DATAYTPE OF UR RESULT
        double x=5;
        double y=2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x/y);
        System.out.println(x%y);
    }
    
}
