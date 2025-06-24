package Challenges;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Challenge2 
{

    //STRUCTURAL PROGRAMMING
    public int getfact1(long num)
    {
        if(num<2){
            return 1;
        }
        int result=1;
        for(int i=2;i<=num;i++)
        {
            result=result*i;
        }
        return result;
    }
   
   
    //FUNCTIONAL PROGRAMMMING USING FUNCTIONAL INTERFACE
    //rangeClosed(val1,val2)BASICALLY HERE val1 AND val2 BOTH ARE INCLUSIVE
    //how does reduce method works
    /*
     * Start with 1 (initial value).
        Add 1: 1 * 1 = 1.
        Add 2: 1 * 2 = 2.
        Add 3: 2 * 3 = 6.
        Add 4: 6 * 4 = 24.
        Add 5: 24 * 5 = 120.
     */
    public int getfact2(int num)
    {
        int factval=IntStream.rangeClosed(1,num).reduce(1,(a,b)->a=a*b);
        return factval;
    }

    //DEMONSTRATION HOW INTSTREAM WORKS
    public void Stream_show(int num)
    {
        IntStream.rangeClosed(1, num).forEach(number->System.out.println(number+""));
    }
   
    public static void main(String[] args)
    {
     /*
     * Write two versions of a program 
     * That calculates the factorial of a number:
     * One using structural (procedural) programming,
     * And the other using functional programming.
     */

     /*
      * FIRST OF ALL CREATE TWO METHODS GETFACT1 AND GETFACT2
      * GETFACT1 EALS WIT STRUCTURAL PRGRAMMING NORMAL CODE
      * GETFACT2 DEALS WITH FUNCTIONAL PROGRAMING
      * FUNCTONAL PROGRAMING TAKES IntStream.rangeClosed(val1,val2) BASICALLY IT GENERATE VALUES RANGEING FROM VAL1 TO VAL2 AND BOTH ARE INCLUSIVE
      * THEN PERFORM REDUCE METHOD ON IT
      */
     //TAKE INPUT
     Scanner input=new Scanner(System.in);
     System.out.print("ENTER THE VALUE FOR WHICH U WANT TO FIND FACTORIAL:- ");
     int num=input.nextInt();
     
     //STRUCTURAL PROGRAMMING
     Challenge2 c2=new Challenge2();
     System.out.println("FACTORIAL OF GIVEN NUMBER "+ num + " IS:- " +c2.getfact1(num));

    //FUNCTIONAL PROGRAMING
    System.out.println("FACTORIAL OF GIVEN NUMBER "+ num + " IS:- " +c2.getfact2(num));

    //DEMONSTRATION OF INT STREAM
    c2.Stream_show(num);

   }

    
}
