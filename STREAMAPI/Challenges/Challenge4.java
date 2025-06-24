package Challenges;
import java.util.*;

public class Challenge4 
{
    public static void main(String[] args) 
    {
        /*
         * .Given a list of integers, 
         * Use stream operations to filter odd numbers and print them.
         */
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(num->num%2==1).forEach(num->System.out.println("ODD NUMBER FROM LIST IS:-"+num +" "));
    }
}
