
import java.util.*;

public class Lec3 {

    /* 
* 🧠 WORKFLOW EXPLANATION:
        * 1. We take the total number of rows as input.
        * 2. For each row:
        *    a. We first print spaces (which start from total_rows - 1 and decrease by 1 per row).
        *    b. Then we print stars (which start from 1 and increase by 1 per row).
        * 3. Each space and star is followed by a tab (`\t`) for alignment.
        *
        * 🔁 LOOP STRUCTURE:
        * - Outer loop (i): Runs from 1 to total_rows.
        * - Inner loop 1 (j): Prints spaces → runs from 1 to `spaces`.
        * - Inner loop 2 (k): Prints stars  → runs from 1 to `stars`.
        *
        * 🔄 Update After Each Row:
        * - Decrease `spaces` by 1.
        * - Increase `stars` by 1.
 
 * ✅ Useful Tip:
 * To reverse the pattern (i.e., from bottom to top), just:
 * - Start `spaces = 0` and increment.
 * - Start `stars = total_rows` and decrement.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int spaces = total_rows - 1;
        int stars = 1;
        for (int i = 1; i <= total_rows; i++) {
            // SPACES
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            // STARS
            for (int k = 1; k <= stars; k++) {
                System.out.print("*" + "\t");
            }

            System.out.println();
            spaces--;
            stars++;
        }
    }
}
