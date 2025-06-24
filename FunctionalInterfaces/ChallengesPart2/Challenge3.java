package ChallengesPart2;
import java.util.Arrays;
import java.util.List;

public class Challenge3 
{
    public static void main(String[] args) {
        /*
         * .Create a list of strings representing numbers ("1", "2", ... ).
         * Convert each string to an integer, 
         * Then again calculating squares of each number using the map operation 
         * And sum up the resulting integers.
         */
        //TAKE LIST HAVING NUMBER VALUES IN STRING 
        List<String> numbers=Arrays.asList("1","2","3");
        
        /*
         * THEN CONVERT THE LIST INTO STREAM
         * THEN CONVERT EACH NUMERIC STRING OBJECT INTO REAL INTEGER OBJECT
         * THEN SQUARE EACH REAL INTEGER UINF POWER INBUILD FUNCTION WHICH RETURNS DOUBLE OBJECT
         * THEN ADD ALL THE DOUBLE OBJECTS USING REDUCE METHOD
         * THEN REDUCE WILL RETURN DOUBLE OBJECT
         */
        Double finalvalue=numbers.stream()
        .map(num1->Integer.parseInt(num1))
        .map(num2->Math.pow(num2,2))
        .reduce(0.0,(n1,n2)->n1+n2);

        System.out.println(finalvalue);
        
    }
}
