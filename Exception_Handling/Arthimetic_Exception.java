import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception 
{
    String str;
    public MyException(String str)
    {
        this.str=str;
    }

    public String getMsg(){
        return str;
    }
}

public class Arthimetic_Exception 
{
    public void divide_oper(int num1,int num2)throws MyException
    {
        try
        {
            int sum=num1/num2;
            System.out.println("UR SUM IS:-" + sum);
        }
        catch(Throwable e) 
        {
            throw new MyException(e.getMessage());
        }
    }

    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        try 
        {
            System.out.print("ENTER THE FIRST NUMBER");
            int num1=input.nextInt();
            System.out.print("ENTER THE SECOND NUMBER");
            int num2=input.nextInt();
            Arthimetic_Exception ae=new Arthimetic_Exception();
            ae.divide_oper(num1, num2);
        }catch(InputMismatchException e)
        {
            System.out.println("This is an error: Invalid input, please enter integers only.");
        }
        catch (MyException e)
        {
            System.out.println("THIS IS THE ERRROR:-"+e.getMsg());
        }
        finally {
            input.close(); // Closing the Scanner object
        }
        
    }
    
}

