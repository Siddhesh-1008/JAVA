
import java.util.*;

public class Lec16 {

//PATTERN: DOUBLE SIDED MIRRORED NUMBERS (WITH CENTRAL GAP)
    public static void main(String[] args) {

        /*
      * 📌 PATTERN: DOUBLE SIDED MIRRORED NUMBERS (WITH CENTRAL GAP)

      * 🎯 OBJECTIVE:
      * - Print a pattern where numbers increase on the left side, 
      *   then a big central space, and then numbers decrease symmetrically on the right side.

      * 🔢 INPUT:
      * - A single integer `total_rows` (e.g., 5)

    🧠 LOGIC BREAKDOWN:

    1. Initialize:
      *    - `star = 1`: Represents how many numbers to print on each side.
      *    - `spaces = 2 * total_rows - 3`: Central space that decreases as we go down.

    2. Outer Loop → runs from 1 to `total_rows`:
      *    - Handles each row of the pattern.

    3. Inner Loops (inside each row):
      *    🔹 First Loop (Left numbers):
      *       - Starts with `val = 1` and prints `star` increasing numbers (1 to val++)
      *
      *    🔹 Second Loop (Spaces in middle):
      *       - Prints `spaces` tabs for gap between left and right parts
      *
      *    🔹 Conditional Check (if i == total_rows):
      *       - On the last row, reduce `star` and `val` so that the middle number is not repeated

      *    🔹 Third Loop (Right numbers):
      *       - Decrements `val` and prints `star` decreasing numbers (val--)

    4. Updates After Each Row:
      *    - `star++`: Increase the count of numbers printed on both sides
      *    - `spaces -= 2`: Shrink the central gap by 2 spaces
📌 KEY CONCEPTS:
      * - Symmetry: Mirror logic using increasing and decreasing values
      * - Middle Gap: Controlled by a space counter (`spaces`) that reduces over time
      * - Edge Case: Avoiding duplicate middle number in the last row using a check (`if i == total_rows`)
         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();
        int star = 1;
        int spaces = 2 * total_rows - 3;

        for (int i = 1; i <= total_rows; i++) {
            int val = 1;

            // STAR
            for (int j = 1; j <= star; j++) {
                System.out.print(val + "\t");
                val++;
            }

            // SPACES
            for (int k = 1; k <= spaces; k++) {
                System.out.print("\t");
            }

            // Check loop for last row
            if (i == total_rows) {
                star--;
                val--;
            }

            // STAR
            for (int l = 1; l <= star; l++) {
                val--;
                System.out.print(val + "\t");
            }

            star++;
            spaces -= 2;
            System.out.println();
        }
    }

}
