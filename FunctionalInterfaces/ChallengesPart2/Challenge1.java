package ChallengesPart2;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Challenge1 
{
    public static void main(String[] args) 
    {
        /*
         * Given an array of integers, create a stream,
         * Use the distinct operation to remove duplicates, 
         * And collect the result into a new list.
         */

         List<Integer> array=Arrays.asList(1,2,3,3,5,4,5,6,7,8);
        
         List<Integer> newList=array.stream()
         .distinct()
         .collect(Collectors.toList());

         Optional<List<Integer>> container=Optional.of(newList);
         if(container.isPresent())
         {
            System.out.println("UR LIST IS:-" + container.get());
         }
         
    }
}
