package MIN_MAX;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 3, 8, 2, 10);

       
        // Find the minimum value using lambda expression
        Optional<Integer> minValue =numbers.stream()
            .min((a, b) -> a.compareTo(b));       // Find minimum value using lambda

        // Find the maximum value using lambda expression
        Optional<Integer> maxValue =numbers.stream()
            .max((a, b) -> a.compareTo(b));       // Find maximum value using lambda

        // Print the results
        System.out.println("Minimum Value: " + minValue.orElse(null));
        System.out.println("Maximum Value: " + maxValue.orElse(null));
    }
}
