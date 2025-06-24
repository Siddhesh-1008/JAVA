package checked_Exception_Throws_keyword;
import java.util.Scanner;

public class throws_keyword {

    public void show(String name) throws IllegalArgumentException
    {
        if(name.contains("-"))
        {
            /*
            HERE IT TRHOWS new IllegalArgumentException("UR STRING CONTAINS HYPHEN")
            WHICH HAS BEEN CATCHED BY ITS PARENT(ONE WHO IS CALLING THIS METHOD THAT IS tk.show(name)) IN MAIN AND THERE IT HAS TRY CATCH BLOCK WHICH CATCHES THE ERROR
             */
            throw  new IllegalArgumentException("UR STRING CONTAINS HYPHEN");
        }
        else{
            System.out.println("UR NAME IS" + name);
        }
    }


    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE ENTER THE NAME");
        String name=input.next();
        throws_keyword tk=new throws_keyword();
        try
         {
            tk.show(name);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("THIS IS UR ERROR:- " + e);
        }
        

    }
    
}