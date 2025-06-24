
import java.util.*;

public class Lec12 {

    // FIBONNACI SERIES RIGHT ANGLE TRIANGLE PATTERN
    public static void main(String[] args) {

        /*
SUMMARY
📌 What It Does:
1.)Input:
  Takes total_rows as input (how many rows the triangle should have).

2.)Fibonacci Initialization:
  prev = 0, next = 1 → starting values of the Fibonacci sequence.

3.)Outer Loop (i from 1 to total_rows):
  Controls the number of rows.

4.)Inner Loop (j from 1 to i):
  Prints the Fibonacci numbers in each row.
  Calculates the next Fibonacci number using:
    total = prev + next,
    then updates prev and next.
*/
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int prev = 0;
        int next = 1;
        for (int i = 1; i <= total_rows; i++) {

            // PRINT FIBONNACI SERIES RIGHT ANGLE TRIANGLE PATTERN
            for (int j = 1; j <= i; j++) {
                System.out.print(prev + "\t");
                int total = prev + next;
                prev = next;
                next = total;
            }
            System.out.println();
        }
    }
}
