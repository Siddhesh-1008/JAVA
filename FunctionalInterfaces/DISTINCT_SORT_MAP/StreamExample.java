package DISTINCT_SORT_MAP;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 3, 8, 2, 10);

        List<Integer> result = numbers.stream()
            .distinct()                           // Remove duplicates: [3, 5, 2, 8, 10]
            .sorted()                             // Sort the numbers: [2, 3, 5, 8, 10]
            .map(num -> num * num)                // Map each number to its square: [4, 9, 25, 64, 100]
            .collect(Collectors.toList());        // Collect the results into a List

        System.out.println(result);
    }
}
