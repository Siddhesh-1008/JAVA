package  STREAM;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod 
{
     public static void main(String[] args)
    {
     /*
     * USED TO REDUCE THE STREAM OF ELEMENTS INTO A SINGLE VALUE
     * REDUCE IS ALSO AN FUNCTIONAL INTREACE
     * BASICALLY IT TAKSE ONE INITIAL VALUE AND A FUNCTION FOR OTHER TWO VALUES
     * BASICALLY HERE WE HAVE  FUNCTIONAL INTERFACE THAT IS BINARY OPERATOR  WHICH CONTAINS ABSTRACT METHOD "APPLY" THAT TAKES TWO AGUMENTS
     * FIRST OF ALL IN List<Integer> list WE STORE INTEGER TYPE OBJECTS
     * THEN WE STORE IT IN STREAM THEN REDUCE OPERATION ARE PERFORMED ON THIS OBJECTS
     * THEN IT RETURN FINAL VALUE AS AN INTEGER OBJET
     * (a,b)->a>b?a:b BASICALLY THIS WILL RETURN A OR B ACORDING TO CONDITION
     */

     /*
      * HOW DOES IT PERFORM
      0 + 1 AS  a AND b
      1 + 2 AS  a AND b
      3 + 3 AS  a AND b
      6 + 4 AS  a AND b
      10 + 5 AS  a AND b
      15 + 6 AS  a AND b
      */
    List<Integer> list=Arrays.asList(1,2,3,4,5,6);
    Integer val=list.stream().reduce(0,(num1,num2)->num1+num2);
    System.out.println("TOTAL SUM:- "+val);

    //TO FIND MAX VALUE
    //FOR STARTING a IS Integer.MIN_VALUE AND b IS 1
    Integer max=list.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
    System.out.println("MAXIMUM VALUE:- "+max);

    
    //TO FIND MIN VALUE
    //FOR STARTING a IS Integer.MAX_VALUE AND b IS 1
    Integer MIN=list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
    System.out.println("MINIMUM VALUE:- "+MIN);
        
     }


}
