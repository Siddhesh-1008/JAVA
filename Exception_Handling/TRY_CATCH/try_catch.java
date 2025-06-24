package  TRY_CATCH;

import java.util.Scanner;

public class try_catch{
    public static void main(String[] args) {
        System.out.println("WELCOME TO CALCULATOR");
        Scanner  input=new Scanner(System.in);
        System.out.print("PLEASE ENTER UR FIRST NUMBER:- ");
        int a =input.nextInt();
        System.out.print("PLEASE ENTER UR SECOND NUMBER:- ");
        int b =input.nextInt();
        /*
         * IN TRY BLOCK WE WRITE THE CODE WHICH WE THINK THAT CAN CAUSE ERROR
         * WHILE CATCH BLOCK USED FOR CATCHING THE ERROR THAT HAS BEEN OCCURED DURING RUNNING THE CODE
         * catch(ArithmeticException exception) HERE ArithmeticExceptionREFERS TO THE ERROR WHILE exception REFERS AS ALLIES
         * exception.getMessage() WILL HELP TO GET EXECT MSG OF ERROR
         * When an exception occurs in the try block, the control is transferred to the catch block, where the exception is handled.
         * IF NO EXCEPTION THEN CODE INSIDE THE TRY BLOCK WILL GET RUN AND WILL GET OUT OF THE LOOP AND WILL NOT GO TO catch()BLOCK
         */
        try{
            double[] arr=new double[5];
            System.out.print( "ENTER THE INDEX NUMBER WHERE U WANT TO STORE THE RESULT:- ");int i=input.nextInt();
            arr[i]=a/b;
            System.out.println("UR RESULT IS:- "+ arr[i] + " AND IT IS STORED AT INDEX NUMBER:- "+ i);
        }
        catch(ArithmeticException exception)
        {
            System.out.printf("%s ENTER VALID VALUES",exception.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            System.out.printf("%s ,please enter proper index number",exception.getMessage());
        }
        catch(Throwable e)
        {
            System.out.println("LAST EXCEPTION");
        }

    }
    
}
