package CUSTOM_EXCEPTION;
public class MyException extends Exception 
{
    String str;
    //CREATE A CONSTRUCTOR BECUASE IN throw new MyException("ERROR IN DENOMINATOR") WE ARE CREATING A CONSTRUCTOR AND PASSING THE PARAMETERS "ERROR IN DENOMINATOR"
    //HERE String str=ERROR IN DENOMINATOR

    public MyException(String str)
    {
        this.str=str;
    }

    //WHEN CATCH CATCHES THIS EXCEPTION THEN WE CAN CALL THIS METHOD
    //catch (MyException e) {system.out.println(e.getMessage())}
    public String getMessage()
    {
        return str;
    }
}
