package  Challenges;
import java.util.Optional;

public class Challenge3 
{
    public static Optional<String> check(String str)
    {
        if(str == null || str.trim().isEmpty())
        {
            return Optional.empty();
        }
        
        return Optional.ofNullable(str.toUpperCase());
    }
    public static void main(String[] args) 
    {
        /*
         * Write a function that accepts a string and returns an Optional<String>. 
         * If the string is empty or null, return an empty Optional, 
         * Otherwise, return an Optional containing the uppercase version of the string.
         */

         /*
          * CREATE CHECK METHOD HAVING OPTIONAL RETURN DATATYPE OPTIONAL<DATATYPE> 
          * IF STIRNG IS NULL OR EMPTY THEN IT WILL RETURN EMPTY OBJECT
          * IF STRING IS NOT NULL OR BLANK THEN IT RETURNS Optional.of() OBJECT BY ADDING STRINGS TO OPTIONAL CONTAINER
          * THEN ON MAIN METHOD Challenge3.check(null) IS BASICALLY EQUALS TO Optional.empty()
          * THUS Optional<String> value1= Optional.empty() THUS OPTAIONAL CONTAINER WILL CONTAIN NULL STRING VALUE STORE IN IT
          * USED OR ELSE TO DEALS WITH NULL VALUE IF NULL IS PRESENT THEN PRINT DEFAUTL VALUE
          */
        Optional<String> value1=Challenge3.check(null);
        Optional<String> value2=Challenge3.check(" ");
        Optional<String> value3=Challenge3.check("sid");
        System.out.println(value1.orElse("NO VALUE PRESENT MEANS NULL"));
        System.out.println(value2.orElse("NO VALUE PRESENT MEANS EMPTY OR WHITESPACE")); // Prints a default message
        System.out.println(value3.get());




    }
}
