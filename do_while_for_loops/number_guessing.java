
import java.util.Scanner;

public class number_guessing
 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //THE NUMBER TO GUESS
        int num=10;
        int guess;
        do 
        { 
            System.out.print("PLEASE GUESS THE NUMBER BETWEEN 0 TO 10 ");
            guess=input.nextInt();
        } 
        //guess!=num GETS TRUE WHEN USER ENTERS WRONG GUESS
        //guess==num MEANS IT IS NOT SATISFYING THE CONDITION THUS FALSE THUS JUMP OUT OF THE LOOP
        while(guess!=num);
        System.out.println("U HAVE SUCCESSFULLY GUESS THE NUMBER");
    }

    
}
