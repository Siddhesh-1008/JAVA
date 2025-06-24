
import java.util.*;

public class Lec2 {

    // DIGIT FREQUENCY
    public static int getDigitFrequency(int number, int fdig) {
        
        int counter = 0;
        // QUOTIENT | REMAINDER
        while (number != 0) {
            int rem = number % 10;
            if (rem == fdig) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fdig = input.nextInt();
        int result = getDigitFrequency(number, fdig);
        System.out.print("DIGIT COUNTS:- " + result);

    }

}
