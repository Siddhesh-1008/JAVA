
import java.util.Scanner;

public class Lec7 {

// PRINT DIAGONAL STARS
    public static void main(String[] args) {
        /*
    SUMMARY
🧠 ALGORITHM WORKFLOW:
    * 1. Take input for `total_rows`.
    * 2. Run a **nested loop**:
    *    - Outer loop `i` from 1 to total_rows → for rows.
    *    - Inner loop `j` from 1 to total_rows → for columns.
    *
    * 3. Inside the inner loop:
    *    - If `i == j` (i.e., diagonal position), print `"*"`
    *    - Else, print a tab space `"\t"`
    *
🔢 KEY POINT:
 * - Only one `*` is printed per row, and it moves diagonally from top-left to bottom-right.
 * - Tabs are used for alignment.

         */

        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        for (int i = 1; i <= total_rows; i++) {
            for (int j = 1; j <= total_rows; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
