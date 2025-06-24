
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain
{
    public static void main(String[] args)
    {
        /*
        * CREATE A LIST AND FILTER EVEN NUMBERS FROM IT WITHOUT STREAM  AND WITH STREAM
        */

        //WITHOUT STREAM
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> listeven=new ArrayList<>();

        for(Integer i:list)
        {
            if(i%2==0)
            {
                listeven.add(i);
            }
        }
        System.out.println(list);
        System.out.println(listeven);

        //WITH STREAM

        //In simple terms, list.stream() is a method in Java that allows you to work with the elements(OBJECTS) of a list 
        //Once you have a Stream, you can perform a variety of operations on the elements, such as filtering, mapping, and reducing.
        
        //CREATE A STREAM
        //BASICLLAY LIST.STREAM() CONVERTS LIST INT STREAM
        Stream<Integer> stream=list.stream();
        
        //THEN FILTER EACH ELEMENTS IN A STREAM
        //IF PREDICATE(BOOLEAN VALUE FUNCTION) RETURNS TRUE THEN PERFORM FILTER OTHERWISE DONT PERFORM
        //stream.filter(EACH_ELEMENT_FROM_LIST->PREDICATE).collect(Collectors.toList())
        //.collect(Collectors.toList()) is used to convert the elements that you've been processing in a stream back into a List
        //.collect(Collectors.toList()): Collects the filtered numbers(THAT SATISFY THE CONDTION "i%2==0") back into a new List.
        //THEN STORE IT IN A LIST WITH ELEMENTS DATATYPE
        List<Integer> newlistofevennos=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newlistofevennos);

        Stream<Integer> stream1=list.stream();
        List<Integer> newList=stream1.filter(i->i>5).collect(Collectors.toList());
        System.out.println(newList);



    }
}