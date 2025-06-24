package CHALLENGES;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList
{
    /*
     * WRITE A PROGRAM TO REVERSE THE LIST
     * WITH THE HELP OF Collections.reverse() MEHTOD REVERSE THE ELEMENTS IN LIS
     */

     public static void reversed_by_doing_code(List<Integer> value1)
     {
        int temp;
        int i=0;
        int j=value1.size()-1;
        while(i<=(j/2))
        {
            /*
             * STORED FIRST ELEMENT IN TEMP VARAIBLE USING temp=value1.get(i);
             * THEN STORE LAST ELEMENT AT STARTING INDEX USING temp=value1.get(i);
             * THEN STORE  LAST INDEX WITH TEMP(WHIC CONTAINS STRATING INDEX ELEMENT) USING value1.set(j-i,temp);
             * INCREMENT i TO MOVE FORWAD FROM STARTING POSITION
             */
            temp=value1.get(i);
            value1.set(i,value1.get(j-i));
            value1.set(j-i,temp);
            i++;
        }
        System.out.println("REVERSED(HARD CODING):-" + value1);
     }

    
     public static void main(String[] args) {
        List<Integer> values=Arrays.asList(1,2,3,4,5,6,7);
        Collections.reverse(values);
        System.out.println(values);


        List<Integer> value1=Arrays.asList(1,2,3,4,5,6,7);
        ReverseList.reversed_by_doing_code(value1);



     }
}
