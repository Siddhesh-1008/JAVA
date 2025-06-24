import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        //NUMBERS ARE PRIME IF THEY ARE DIVIDED BY 1 AND NOT DIVIDED BY SMALLER NUMBER THAN USER INPUT NUMBER
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE CHECK THE NUMBER IS PRIME OR NOT:- ");
        int num=input.nextInt();
        boolean prime=isprime(num);
        //IF RETURN TRUE THEN !prime RESULTS INTO FALSE THUS PRINT NOT PRIME 
        //IF RETURN FALSE THEN !prime RESULTS INTO TRUE THUS PRINT  PRIME 
        if(!prime){
            System.out.println("NUMBER IS PRIME");
        }
        else{
            System.out.println("NUMBER IS NOT PRIME");
        }
        System.out.println();
        //ternary operator
        System.out.println("YOUR NUMBER IS " + (!prime ? "PRIME":"NOT PRIME"));

    }

    public static boolean isprime(int num)
    {
        //for number 1 and 2 returN true as it is a prime number
        if(num==1 || num==2){
            return false;
        }

        //START FROM NUMBER 2
        for(int i=2;i<num;i++)
        {
            //RETURN TRUE AS SOON AS UR num%1==0 && num%i==0 FOR THE FIRST TIME
            //MEANS 4%1==0 AND 4%2==0 SATISIFIES THE CONDITION THUS RETURN TRUE 
            if(num%1==0 && num%i==0)
            {
                return true;
            }
        }
        return false;
        
    }
}
