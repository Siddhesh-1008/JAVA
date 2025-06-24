
import java.util.*;

public class Lec11 {
// To print a right-angle triangle pattern with increasing numbers starting from 1

    public static void main(String[] args) {
        /*
          📌 How It Works:
          Input:
              The user enters the number of rows (total_rows) for the triangle.

          Variables:
              num starts at 1 and keeps increasing with each number printed.

          Outer Loop (i):
              Runs from 1 to total_rows
              Each iteration represents a new row in the triangle.

          Inner Loop (j):
              Runs from 1 to i (number of columns increases with each row)
              Prints the current value of num, then increments it.

          🧱 Pattern Shape:
              Forms a right-angled triangle aligned to the left.  
              Numbers increase sequentially from top to bottom, left to right.
         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int num = 1;
        for (int i = 1; i <= total_rows; i++) {
            // PRINTING INCREASING NUM IN RIGHT ANGLE PATTERN
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }

    }
}
