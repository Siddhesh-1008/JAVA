package CUSTOM_EXCEPTION;

public class custom_exception
{
    /*
     * CREATE DIVIDE METHOD
     * THEN CHECKED WHETHER UR SUM==0 IF YES THEN THROW CUSTOM EXCEPTION 
     * THIS CUSTOM EXCEPTION ARE CREATED BY USER public class MyException extends Exception  BY EXTENDING EXCPETION CLASS
     * AS WE ARE EXTENDING EXCEPTION THUS CUSTOM EXCETIONS ARE CHECKED EXCEPTION THATS WHY WE HAD USED throws MyException
     */
    public void divide(int i ,int j) throws MyException
    {    
        int sum=i/j;
        if(sum==0)
        {
            throw new MyException("ERROR IN DENOMINATOR");
        }
        else
        {
            System.out.println("UR ANSWER IS:- "+ sum);
        }
    }

    public static void main(String[] args)
     {
        custom_exception ce=new custom_exception();
        try 
        {
            ce.divide(10, 20);
        } 
        catch (MyException e) 
        {
            System.out.println(e);
        }
        

    }
    
}
