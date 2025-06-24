
import java.util.Scanner;

public class factorial 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NUMBER FOR WHICH U NEED TO FIND FACTORIAL:- ");
        //WE ARE GIVING INT BUT FACTORIALS ANSWWER CAN BE IN LONG SO WE NEED TO MAKE METHOD DATA TYPE AS LONG 
        int num=input.nextInt();
        //RETURN VALUE HAS DATATYPE LONG
        long result=factorial(num);

        System.out.println("FACTORIAL OF NUMBER:-"+result);
    }

    /**
     * CODE FOR FACTORIAL OPRATION
     * @param num
     * @return
     */
    public static long factorial(int num)
    {
        int i=2;
        int mul=1;
        //FOR 0 AND 1 FACTORILA IS 1
        if(num<2){
            return 1; 
        }

        while(i<=num)
        {
            mul=mul*i;
            i++;
        }
        return mul;
    }
    
    
}
