
import java.util.*;

public class Lec5 {

    // PRINT DIAMOND PATTERN
    public static void main(String[] args) {
        /*
* 🧠 ALGORITHM WORKFLOW:
 * 1. Initialize:
 *    - `spaces = total_rows / 2` (to start with center alignment)
 *    - `stars = 1` (first row always has 1 star)
 *
 * 2. Outer loop runs from `1 to total_rows`:
 *    a. Print `spaces` number of tabs.
 *    b. Print `stars` number of stars with tabs.
 *
 * 3. Update values after each row:
 *    - If current row is in the **top half** (i ≤ total_rows / 2):
 *        - `spaces--` → move left
 *        - `stars += 2` → increase stars by 2
 *    - If current row is in the **bottom half**:
 *        - `spaces++` → move right
 *        - `stars -= 2` → decrease stars by 2
 *
 * 🔢 KEY POINTS:
 * - `total_rows` should be **odd** to maintain symmetry.
 * - Use `System.out.print("\t")` for alignment.
 * - `total_rows / 2` uses integer division, so 5 / 2 = 2 (middle is 3rd row).
 *
         */

        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int spaces = total_rows / 2;
        // System.out.print(spaces); ONLY TAKE INTEGER VALUE MEANS 5/2 WILL BE 2.5 BUT TAKE 2
        int stars = 1;

        for (int i = 1; i <= total_rows; i++) {
            // System.out.println(spaces + " " + stars);

            // SPACES ON EACH ROW
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            // STARS ON EACH ROW
            for (int k = 1; k <= stars; k++) {
                System.out.print("*\t");
            }

            // CHECKING WHTHER I REACHED TO MIDDLE ROW
            if (i <= total_rows / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
            System.out.println();
        }
    }
}
