
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamobjects
{
    public static void main(String[] args)
    {
        //DIFFERENT METHOD TO CREATE STREAM OBJESCTS

        //CREATE BLANK STREAM
        Stream<Object> stream1=Stream.empty();
        stream1.forEach(e->System.out.println(e));

        //CRATING STREAM FOR AARAYS
        //If you have an array of strings, you need to convert it to a stream using Arrays.stream():
        String[] names={"A","B","c","D","E"};
        int[] numbers={1,2,3,5};
        
        Stream<String> stream2=Arrays.stream(names);
        IntStream stream3=Arrays.stream(numbers);

        stream2.forEach(name->System.out.println(name));
        stream3.forEach(num->System.out.println(num));


        

        
    }
    
}
