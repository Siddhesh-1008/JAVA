
import java.util.Scanner;

public class revers_the_digits {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER THAT U WANT TO REVERSE:- ");
        int num=input.nextInt();
        int res=revers(num);
        System.out.println("REVERSE THE DIGIT:- "+ res);
    }

    /**
     * REVERSE LOGIC BY STORING THE LAST DIGIT NUMBER IN new_num
     * @param num
     * @return
     */
    public static int revers(int num)
    {
        int new_num=0;
        while(num>0)
        {
            //GET LAST DIGIT NUMBER 9,4,2
            int last_digit=num%10;
            /*
            new_num=new_num*10+last_digit;
            new_num=0*10+9;   9
            new_num=9*10+4;   94
            new_num=94*10+2   942
            */
            new_num=new_num*10+last_digit;

            //GET DIVISIOR 24,2
            num=num/10;
        }
        return  new_num;
    }

}
