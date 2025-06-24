package  Challenges;


import java.util.Arrays;
import java.util.List;

public class Challenge3 
{
    public static void main(String[] args)
    {
        /*
         *Given a list of strings, 
         *Use stream operations to filter out strings that have length of 10 
         *Or more and then concatenate the remaining strings.
         */
        /*
         * FIRST OF ALL TAKE A STRING LIST THAT CONTAINS STRING HAVING LENGTH GREATER THAN 10 OR SMALLER THAN IT
         * THEN APPLY FILTER METHOD ON IT TO FILTER STRINGS THAT HAS LENGETH GREATE THAN OR EQUAL TO 10 MEANS IT WILL NOT CONSIDER STRINGS HAVING LENGTH SAMLLER THAN 10
         * THEN WITH REDUCE METHOD WE BASICALLY CONCATENATE FILTER STRINGS 
         * AS REDUCE IS A TERMIANL CONDITON 
         * THEN IT RERUN STRING OBJECT THAT CAN BE ACCESSED BY CREATING ITS CLASS
         */
        
        List<String> names=Arrays.asList("Siddhesh sawant","bad","is teaching java","ghatiya","ganda","in reputated classes"); 

        String fullname=names.stream()
        .filter(name->name.length()>=10)
        .reduce("",(str1,str2)->str1+ " "+ str2);
        System.out.println(fullname);


        
    }
}
