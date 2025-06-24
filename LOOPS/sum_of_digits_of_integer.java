
import java.util.Scanner;

public class sum_of_digits_of_integer {
    public static void main(String[] args) 
    {
        //LOGIC OF SUM OF DIGITS OF INTEGER
        //INTEGER IS 236
        //IF 236%10=6 AND 236/10=23
        //236%10=6 GIVES U LAST DIGIT(RIGHT MOST BIT)
        //236/10=23 GIVES U NUMBER BY REMOVING LAST DIGIT THAT WILL BE 23
        //THEN 23%10=3  AND 23/10=2
        //THEN 2%10=2   AND 2/10=0
        //ONCE UR DIVISIOR GETS 0 THEN STOP THE LOOP
        Scanner input=new Scanner(System.in);
        System.out.print("SUM OF ALL DIGITS OF AN INTEGER:- ");
        int digit=input.nextInt();
        sumOfDigits(digit);

        
    }

    public static void sumOfDigits(int digit)
    {
        int val;
        int sum=0;
       while(digit>0)
       {
            //RETURN THE RIGHT MOST BIT (LAST DIGIT)
            val=digit%10;
            sum=sum+val;
            //REMOVE THE RIGHT MOST BIT(LAST DIGIT)FROM WHOLE DIGIT
            digit=digit/10;
        }
        System.out.println("SUM OF ALL INTEGERS OF A DIGIT:- "+sum);
    }
    
}
