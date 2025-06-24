package CHALLENGES;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class reverse_Stings_in_Array
{
    public static void reversing_Array(List<String> list)
    {
        Comparator<String> comp=new Comparator<String>()
        {
            public int compare(String str1,String str2)
            {
                //BY DEFAULT SORTING OF STRINGS BY SORT METHOD DEPEND UPON ALPHABETICE ORDERS
                //BUT IF WE WANT THAT ALPAHBETS MUST ARRANGE IN DESCENDING ORDER TEHN MAKE USE OF CUSOTM COMPARATOR
                //  *BASICALLY HERE STR1 AND STR2 ARE BOTH OBJECTS 
                //  * FIRST OF ALL CRAETE A COMPARATOR OBJECT
                //  * THEN TAKE TWO STRINGS ARAYANA AND BABLU AS STR1 OR STR2
                //  * THEN IF BOTH ARE EQUAL THEN RETURN 0 MEANS DONT DO ANY CHANGE
                //  * IF ITS STARTING CAHARACTER OF STR1 IS SMALLER THAN STARTING CAHARACTER OF STR2
                //  * THEN BASICALLY RETURN 1 MEANS JUST SWAP NOW AS A IS 65 AND B IS 66 THEN JUST SWAP NOW B THEN A
                //  * BASICALLY THEY ARE COMPARING ASCII VALUES OF STARTING CHARACTER OF BOTH THE STRINGS
                //  * IF ITS STARTING CAHARACTER OF STR1 IS BIGGER THAN STARTING CAHARACTER OF STR2
                //  * THEN BASICALLY RETURN -1 MEANS DONT SWAP
                //  * IN THESE WAY WE CAN PERFORMINGSORTING N DESCENDING ORDER
                    if(str1.equals(str2))
                    {
                        return 0;
                    }
                    else if(str1.charAt(0)<str2.charAt(0))
                    {
                        /*
                         * A IS SMALLER THAN B THEN SWAP MEANS B THEN A
                         */
                        return 1;
                    }
                    else
                    {
                        return -1;
                    }
            
            }
        };
        
        Collections.sort(list,comp);
        System.out.println(list);

    }
    


    public static void main(String[] args)
    {
        List<String> list=Arrays.asList("A","B","C","D");
        reversing_Array(list);


    }
}
