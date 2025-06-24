package Challenges;

//FUNCTIONAL INTERFACE
@FunctionalInterface
interface Functional
{
    public abstract boolean isValue(int num);
}

public class Challenge1 
{
    public static void main(String[] args)
    {
    /*
     * Create your own functional interface 
     *With a single abstract  method that accepts an integer and returns a boolean.
     *Implement it using a lambda that checks if the number is prime.
     */

     /*
      * CREATED FIRST FUNCTIONAL INTERFACE WITH PUBLIC ABSTRACT METHOD HAVING RETURN TYPE BOOLEAN WITH ONE ARGUMENT num
      * IN MAIN METHOD WE CREATE ANONYMOUS CLASS FOR INTERFACE interface_name variable=new interface_name{INITALIZE THE ABSTRACT METHOD THAT IS public abstract boolean isValue(int num){} }
      * THEN WRITE LOGIC INSIDE IT WHICH SAYS NUMBER IS PRIME ONLY IF IT GETS DIVIDE BY 1 AND DOESNT GET DIVIDE BY ITS SMALL VALUES OF THAT NUMBER
      * THEN CALL THE METHODS OF INTERFACE ANS PASS THE ARGUMETN TO IT 
      * THEN USE TERINNARY OPERTOR TO PRINT PRIME OR NON PRIME
      */

    //CREATE ANONYMOUS CLASS FOR FUNCTIONAL INTERFACE
     Functional  functionalInterface=new Functional() 
     {
             public boolean isValue(int num)
             {
                //LOGIC TO CHECK IF NUMBER IS PRIME OR NOT
                for(int i=2;i<num;i++)
                {
                    if((num%1==0) & (num%i==0))
                    {
                        return false;
                    }
                }
                 return true;
             }
     };
     
     //GET BOOLEAN VALUE 
     boolean val=functionalInterface.isValue(8);

     //TERNIARY OPERATOR TO PRINT STRING
     String p=val?"PRIME":"NOT A PRIME";

     System.out.println(p);
        
    }

}
