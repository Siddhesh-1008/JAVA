package  CHALLENGES;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Characters_In_String {
    /*
     * Write a program that takes a string and returns the number of unique characters using a Set.
     */

    public static void main(String[] args) 
    {
        /*
        CREATE SET WITH WRAPPER CLASS CHARACTER
         * SET DOESNOT ALLOW DUPLICATE VALUES
         * TAKE STRING FROM USER
         * THEN ITERATE THE STRING 
         * U CAN USE WHILE OR FOR LOOP AND GET EACH CHARACTER FROM STRING
         * U CAN USE string.toCharArray() BASICALLY THESE METHOD CONVERTS UR STRING INTO ARRAY OF CAHRACTERS MEANS STRING IS SIDDHU THEN IT WILL CONVERT IT AS ["S","I","D","D","H","U"]
         * THEN ADD THSE CHARACTERS TO SET AS SET WONT ALLOW DUPLICATE VALUES IT WILL ELIMINATEDUPLICATE CHARACTERS FROM STRINGS
         * THEN THE SIZE OF SET WOULD COTIAN NUMBER OF UNIQUE CHARACTERS
         * 
         */
        
         Scanner input=new Scanner(System.in);
         Set<Character> uniquecharacters=new HashSet<>();
         System.out.print("PLEASE ENTER THE TEXT:- ");
         String text=input.next();
         for(char ch:text.toCharArray())
         {
            uniquecharacters.add(ch);
         }
         System.out.println("NUMBER OF UNIQUE CHARACTERS IN TEXT ARE:- "+ uniquecharacters.size());
         

         
    }
}
