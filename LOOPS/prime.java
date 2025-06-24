
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        //PRIME NUMBERS ARE THE NUMBERS WHICH GET DIVIDED BUT NOT GET DIVIDED BY SMALLER NUMBER THAN INPUT NUMBER
        //IF GIVEN 5 THEN IT MUST DIVIDED BY 1 AND NOT DIVIDED BY THE NUMBERS 2,3,4
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER THAT U WANT TO CHECK WHETHER IT IS PRIME OR NOT:-");
        int num=input.nextInt();
        boolean res=prime_check(num);
        if(res){
            System.out.println("PRIME");
        }
        else{
            System.out.println("NOT A PRIME");
        }
        
    }

    public static boolean prime_check(int num)
    {
        int i=2;
        while(i<num)
        {
            //INPUT_NUMBER IS NOT PRIME ONLY IF INPUT_NUMBER GETS DIVIDED BY NUMBER SMALLER THAN INPUT_NUMBER
            //SEE HERE INPUT NUMBER 4 GETS DIVIDED BY 1 AS WELL AS DIVIDED BY 2 THUS IT IS NOT A PRIME NUMBER
            //SEE HERE INPUT NUMBER 5 GETS DIVIDED BY 1 AS WELL AS NOT DIVIDED BY 2,3,4 THUS IT IS A PRIME NUMBER
            if(num%i==0)
            {
                return false;
            }
            i++;
        }
        //FOR NUMBER 0 AND 1 IT WILL RETURN TRUE AS 0 AND 1 WILL NOT GO INSIDE WHILE LOOP
        return  true;
    }
    
}
