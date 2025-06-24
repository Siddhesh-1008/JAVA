package CHALLENGES;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Count_frequency_of_element{
    /*
     * Use the Collections class to count the frequency of a particular element in an ArrayList.
     */
    
     public static void main(String[] args)
    {
        List<Integer> values=new LinkedList<>();
        values.add(1);
        values.add(1);
        values.add(5);
        values.add(2);
        values.add(5);
        values.add(3);
        int freq1=Collections.frequency(values, 1);
        System.out.println("NUMBER OF TIMES SPECIFIC ELEMENT OCCURS :- "+freq1);
        int freq2=Collections.frequency(values, 5);
        System.out.println("NUMBER OF TIMES SPECIFIC ELEMENT OCCURS :- "+freq2);
        int freq3=Collections.frequency(values, 2);
        System.out.println("NUMBER OF TIMES SPECIFIC ELEMENT OCCURS :- "+freq3);

        
    }
}
