package Challenges;

import java.util.function.BinaryOperator;

public class Challenge1
{

    public static void main(String[] args)
    {
        /*
         *Write a lambda expression that takes two integers 
         *And returns their multiplication. 
         *Then, apply this lambda to a pair of numbers.
         */

         //BINARY OPERATOR FUNCIONAL INTERFACE HAS APPLY AS AN ABSTRACT METHOD
         //AS IT IS AN FUNCTIONAL INTERFACE WE CAN APPLY LAMDA EXPRESSION ON APPLY METHOD
         //NAD BASICALLY IT RETRUNS INTEGER OBJECT SO WE NEED TO CREATE REFERENCE OF BINARYOPERATOR INTERFACE
         BinaryOperator<Integer> mul=(a,b)->a*b;
         int result=mul.apply(4, 5);
         System.out.println(result);
         

    }
    
}
