package Challenges;
import java.util.Arrays;

public class Challenge2 
{
    public static void main(String[] args) 
    {
        /*
         * Convert an array of strings into a stream. 
         * Then, use the stream to print each string to the console.
         */
        //DECALRE AND INITIALIZE ARRAY
        String[] names={"Alice", "Bob", "Charlie"};

        //Convert an array of strings into a stream.  Arrays.stream(names)
        //Then, use the stream to print each string to the console.
        Arrays.stream(names).forEach((name)->System.out.println(name));
    }
}
