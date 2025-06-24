import java.util.Scanner;

public class recurssion {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMER FOR WHICH U WANT TO FIND FACTORIAL:-");
        int num=input.nextInt();
        int value=recursivefactorial(num);
        System.out.println("FACTORIAL VALUE:- " + value);
    }
    
   /**
    * RECURSIVE CODE FOR FACTORIAL
    * @param num
    * @return
    */
    public static int recursivefactorial(int num){

        /*
        num=5
        return 5 * recursivefactorial(5-1);  CALL recursivefactorial(4) AGAIN
        return 4 * recursivefactorial(4-1);  CALL recursivefactorial(3) AGAIN
        return 3 * recursivefactorial(3-1);  CALL recursivefactorial(2) AGAIN
        return 2 * recursivefactorial(2-1);  CALL recursivefactorial(1) AGAIN
        if num==1 return 1
        return 2*1
        return 3*2
        return 4*6
        return 5*24
        THUS 120 WILL GET RETURN TO recursivefactorial(num); THAT HAS BEEN CALLED FOR THE FIRST TIME
        AS FATORIAL WORKS ACCORDINGLY 5*(4)! 4*(3)! 3*(2)! 2*(1)! 
         */
        //BASE CONDITION
        //AS FACTORAIL 1 RETURN VALUE 1
        if (num==1)
        {
            return 1;
        }
        return num * recursivefactorial(num-1);
    }
}
