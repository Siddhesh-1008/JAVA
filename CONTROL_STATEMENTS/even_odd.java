
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER");
        int num=input.nextInt();
        odd_or_even(num);
    }

    public static void odd_or_even(int num){

        String even_or_odd=num%2==0?"EVEN":"ODD";
        System.out.println("UR NUMBER IS:- "+ even_or_odd);
    
    }
}
