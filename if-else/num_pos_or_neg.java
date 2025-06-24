
import java.util.Scanner;

public class num_pos_or_neg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER TO SEE IT IS + - OR 0");
        int number=input.nextInt();
        if(number>0){
            System.out.println("POSITIVE NUMBER");
        }else if(number==0){
            System.out.println("ZERO NUMBER");
        }else{
            System.out.println("UR NUMBER IS NEGATIVE");
        }

    }
}
