
import java.util.Scanner;

public class Lec12 {

    public static void main(String[] args) {
        /*
📌Key Features:
Input: Takes a single integer from the user.

Digit Counting:
1.)Uses a temporary variable (temp) to count how many digits are in the input number.
2.)The digit count is calculated by repeatedly dividing the number by 10.

Digit Extraction:
1.)Calculates a divisor (div) as 10^(number of digits - 1) to extract digits from left to right.
2.)In each iteration:
    Divides the number by div to get the current digit.
    Updates the number using modulus (%) to remove the extracted digit.
3.)Reduces the divisor by a factor of 10.


         */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int temp = number; // backup for digit count
        int no_of_digits = 0;

        // COUNT NUMBER OF DIGITS
        while (temp != 0) {
            no_of_digits++;
            temp = temp / 10;
        }

        // PRINT EACH DIGIT
        int div = (int) Math.pow(10, no_of_digits - 1);
        while (div != 0) {

            int q = number / div;
            System.out.println(q);       // print digit
            number = number % div;       // remove most significant digit
            div = div / 10;              // reduce divisor
        }
    }
}
