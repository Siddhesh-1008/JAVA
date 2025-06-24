package CHALLENGES;

import java.util.Arrays;
import java.util.List;

public class Swapping_elements 
{
    /*
     * Write a method that swaps two elements in an ArrayList, given their indices.
     */
    
    public static void swapping_two_index_elements(List<Integer> values,int index1,int index2)
    {
        int temp=values.get(index1);
        values.set(index1,values.get(index2));
        values.set(index2,temp);
        System.out.printf("AFTER SWAPPING VALUES AMONG INDEX1:- %d AND INDEX2:- %d \nWE GET LIST AS:- %s",index1,index2,values);
    }
    
     public static void main(String[] args) 
    {
        /*
         * BASICALLY SWAP INDEX 1 ELEMENT FROM INDEX 1 TO INDEX 2 
         * BASICALLY SWAP INDEX 2 ELEMENT FROM INDEX 2 TO INDEX 1
         * BASICALLY FIRST CREATE A SWAP METHOD AND PASS LIST AND TWO INDEXES TO IT AS A PARAMETER
         * FIRST CREATE A TEMP VARAIBLE AND STORE VALUE THAT ARE PRESENT AT INDEX 1
         * THEN ON INDEX1 SET INDEX 2 ELEMENT ON IT
         * THEN ON INDEX2 SET TEMP VALUE ON IT(MEANS INDEX 1 ELEMENT THAT IS STORED IN TEMP)
         */
        
        List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("WITHOUT SWAPPING :-" + values);
        Swapping_elements.swapping_two_index_elements(values,2,7);
    }
}










































