
import java.util.*;

public class Lec15 {

    public static void main(String[] args) {
        /*
 * 📌 PATTERN: NUMBER DIAMOND (CENTERED)
 *
 * 🎯 OBJECTIVE:
    * - To print a centered diamond-shaped number pattern, where each row has 
    *   increasing and then decreasing values symmetrically.
    *
 * 🔢 INPUT:
      * - A single odd integer `total_rows` (example: 5 or 7)

 * 🧠 LOGIC BREAKDOWN:
    * 1. Initialize:
    *    - `spaces = total_rows / 2`: Number of spaces before numbers starts (for centering).
    *    - `numbers = 1`: Total numbers to print in current row.
    *    - `val = 1`: Starting number of the row.
    *
 * 2. Outer Loop → runs from 1 to `total_rows`:
    *    - Handles each row of the pattern.

 * 3. Inner Loops:
      *    🔹 First Inner Loop (for spaces):
      *       - Prints tabs `\t` to align numbers in center.
      *    🔹 Second Inner Loop (for numbers):
      *       - Start from `val`, increment till the middle of the row,
      *         then decrement after the middle.
      *       - This creates the symmetrical number effect.

 * 4. Update Logic (middle check):
      *    - First Half (i ≤ total_rows / 2):
      *       - Decrease spaces by 1
      *       - Increase number count by 2
      *       - Increase starting value (`val`) by 1
      *    - Second Half:
      *       - Reverse the above logic to shrink the diamond
 *
 ✅ SAMPLE OUTPUT (for total_rows = 5):

        1
      2 3 2
    3 4 5 4 3
      2 3 2
        1

    📌 KEY CONCEPTS:
    * - Symmetry: Built using mirror logic (increasing till mid, then decreasing)
    * - Centering: Achieved by adjusting spaces before printing numbers
    * - Row-wise dynamic value generation using `val` and `t`
         */

        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int spaces = total_rows / 2;
        int numbers = 1;

        int val = 1;
        for (int i = 1; i <= total_rows; i++) {

            // SPACES
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            // NUMBERS
            int t = val;
            for (int k = 1; k <= numbers; k++) {
                System.out.print(t + "\t");
                if (k <= numbers / 2) {
                    t++;
                } else {
                    t--;

                }
            }

            // CHECK 
            if (i <= total_rows / 2) {
                spaces--;
                numbers += 2;
                val++;
            } else {
                spaces++;
                numbers -= 2;
                val--;
            }

            System.out.println();
        }
    }

}
