package STREAM;

import java.util.Arrays;
import java.util.List;

public class STREAM_METHODS
{
    public static void main(String[] args) 
    {
        /*
         * WE CAN CRATE LAMBDA EXPRESSION FOR FUNCTION INTERFACE(PREDICATE,CONSUMER)
         * HERE CONSUMER IS FUNCTION INTERFACE THAT WE NEED TO PROVIDE IN FOREACH LOOP  CONAINS ABSTRACT METHOD THAT TAKES ONE ARGUMENTS
         * HERE PREDICATE IS FUNCTION INTERFACE THAT WE NEED TO PROVIDE IN FILTER LOOP CONAINS ABSTRACT METHOD THAT TAKES ONE ARGUMENTS
         * FUNCTIONAL INTERFACE  CONSISITS ONLY ONE ABSTRACT METHOD
         * ALWAYS REMEMBER STREAM WILL NOT PRINT ANY THING UNTIL IT GETS ATTACHED WITH TERMINAL OPERATION
         * HERE FILTER IS NOT AN TERMINAL OPERATION AS IT RETURNS STREAM
         * BUT FOREACH LOOP IS A TERMINAL CONDITION THUS IT DOENOT RETURN ANYTHING
         * IF THERE IS NO TERMINAL OPERATION THEN STREAM(SEQUENCE OF ELEMETNS ) JUST FLOWS
         * AND WE CAN STORE IT IN Stream<RETURN_DATATYPE> var_name
         */
        System.out.println("PRINTING FRUITS WITH FOR EACH");
        List<String> fruitsname=Arrays.asList("BANNANA","KELA","CHOCO");
        fruitsname.stream().forEach(fruit->{System.out.println(fruit);});

        System.out.println("\nPRINTING FRUITS WITH FILTER");
        fruitsname.stream()
        .filter(fruit->fruit.endsWith("A"))
        .forEach(fruit->{System.out.println(fruit);});
    }
}
