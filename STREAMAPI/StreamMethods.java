
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods
{
    public static void main(String[] args) 
    {
        //FILTER
        List<String> names=Arrays.asList("ARYAN","LAMBDA","CAT","DOG");
        Stream<String> stream=names.stream();
        List<String> newstream=stream.filter(name->name.startsWith("A")).collect(Collectors.toList());
        for (String newnames:newstream)
         {
            System.out.println(newnames);
        }

        //WE CAN ALSO USE FOR EACH LOOP
        //foreachloop
        newstream.forEach(n->{
            System.out.println(n);
        });

        //MAP
        List<Integer> numbers=Arrays.asList(1,2,3,4);
        Stream<Integer> stream1=numbers.stream();
        List<Integer> newstream1=stream1.map(num->num*num).collect(Collectors.toList());
        for(Integer nums:newstream1)
        {
            System.out.print(nums + " ");

        }
        System.out.println();
        
        //SORTED 
        //TO SORT NAMES
        List<String> sortnames=Arrays.asList("ARYAN","LAMBDA","CAT","DOG");
        Stream<String> stream3=sortnames.stream();
        stream3.sorted().forEach(s->{System.out.print(s + " ");});

        System.out.println();


        //SORTED STRINGS IN DESCENDING ORDER
        Comparator<String> comp=new Comparator<String>() 
        {
            public int compare(String s1,String s2)
            {
                if(s1.charAt(0)<s2.charAt(0))
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
                
            }
        };
        Stream<String> stream4=sortnames.stream();
        stream4.sorted(comp).forEach(s->{System.out.print(s + " ");});


        System.out.println();
        /*
         * ALWAYS REMEMEBER
         * List<Integer>  CONTAINS INTEGER TYPE OBJECTS THAT IS 11 22 1 4
         * THEN  sortednumbers.stream() converts the List<Integer> called sortednumbers into a Stream of Integer objects.
         * AND STORED THAT STREAM OBJECTS IN Stream<Integer> stream5 WHERE INTGER IS THE DATAYPE OF THE OBJECTS STORED
         * stream5.min(comp1) ALSO RETRUN INTEGER TYPE OBJECT
         * we need to write orElse(null)when we operate with .min,,max ON ANY STREAM
         */
        //find min number
        List<Integer> sortednumbers=Arrays.asList(11,22,1,4);
        Stream<Integer> stream5=sortednumbers.stream();
        Comparator<Integer> comp1=new Comparator<Integer>()
        {
            public int compare(Integer i1,Integer i2)
            {
                if(i1>i2)
                {
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        Integer val=stream5.min(comp1).orElse(null);
        System.out.println(val);

    

    }
    
}