
package  COLELCTIONS_CLASS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class String_Sorter_Descending 
{
    /*
     * SORT LIST OF STRINGS IN DESCENDING ORDER BY TWO METHODS NORMAL SORTING AND ANOTHER WITH  CUSTOM COMPARATOR
     * List<String> name=Arrays.asList(values,values) BASICALLY HERE "(values,values)" THEY ARE TREATED AS ARRAY AND ASLIST BASICALLY CONVERTS THIS ARRAY TO LIST AND STORED IT IN List<String> name
     *  Collections.sort() is a utility method that sorts a list in place and does not return a new list or store the result. Instead, it modifies the list you pass to it directly.
     * AS IT DOESNOT RETURN NEW LIST SO WE CANT STORE IT IN NEW VARAIBLE
     *  
     */
    
    public static void sortDescendingOrder(List<String> stringList)
    {
        //SORT STRINGS IN ASCENDING ORDER BY SEEING THE STARTING ALPHABETS OF STRINGS
        Collections.sort(stringList);
        //REVERSE THE STRINGS THAT ARE SORTED IN ASCENDING ORDER
        Collections.reverse(stringList);
        System.out.println("UR LIST WITH SORITNG IN DESCENDING ORDER:- " +stringList);
    }

    public static void customcomparator_for_Sorting(List<String> stringList2)
    {
        Collections.sort(stringList2,new Comparator<String>() 
        {
            /*
             * FIRST OF ALL CRAETE A COMPARATOR OBJECT
             * THEN TAKE TWO STRINGS BABLU AND ARAYANA AS STR1 OR STR2
             * THEN IF BOTH ARE EQUAL THEN RETURN 0 MEANS DONT DO ANY CHANGE
             * IF ITS STARTING CAHARACTER OF STR1 IS SMALLER THAN STARTING CAHARACTER OF STR2
             * THEN BASICALLY RETURN 1 MEANS PUT SMALLER STRING FORWARD 
             * BASICALLY THEY ARE COMPARING ASCII VALUES OF STARTING CHARACTER OF BOTH THE STRINGS
             * IF ITS STARTING CAHARACTER OF STR1 IS BIGGER THAN STARTING CAHARACTER OF STR2
             * THEN BASICALLY RETURN 1 MEANS PUT BIGGER STRING BACKWARD
             * IN THESE WAY WE CAN PERFORMINGSORTING N DESCENDING ORDER
             */
            @Override
            public int compare(String str1, String str2) {
                System.out.println("Comparing: " + str1 + " with " + str2);
                if(str1.equals(str2))
                {
                    return 0;
                }
                else if(str1.charAt(0)<str2.charAt(0))
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        });
        System.out.println("UR LIST WITH SORITNG IN DESCENDING ORDER:- " + stringList2);
    }
    
    public static void main(String[] args) 
    {
        List<String> stringList=Arrays.asList("SIDDHESH","ZOYA", "ARYAN", "RAHUL");
        System.out.println("UR LIST WITHOUT SORITNG:- " + stringList);
        String_Sorter_Descending.sortDescendingOrder(stringList);
        
        System.out.println();
        List<String> stringList2=Arrays.asList("BABLU", "ARAYAN", "CAT", "DOG");
        System.out.println("UR LIST WITHOUT SORITNG:- " + stringList2);
        String_Sorter_Descending.customcomparator_for_Sorting(stringList2);

        
    }
}
