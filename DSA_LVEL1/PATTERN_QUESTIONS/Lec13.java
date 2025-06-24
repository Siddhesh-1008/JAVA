
import java.util.Scanner;

public class Lec13 {

    public static void main(String[] args) {
        /*

      * 📌 PATTERN: PRINT PASCAL'S TRIANGLE
      *
      * 🎯 OBJECTIVE:
      * - Display Pascal’s Triangle based on the number of rows given by the user.
      *
      * 🧠 LOGIC:
      * 1. Outer loop (`i`) runs from `0` to `total_rows - 1`:
      *    - This represents each row of the triangle.
      *    - We start from 0 to follow Pascal's Triangle structure correctly.
      *
      * 2. Inner loop (`j`) runs from `0` to `i`:
      *    - For every row `i`, print `i + 1` values.
      *    - The number of values in each row is always `row_index + 1`.
      *
      * 3. Use the **Combination Formula**:
      *    - The value at each position in Pascal's Triangle is:  
      *      **nCr = (n!)/(r!(n-r)!)**
      *    - But to optimize, we use:  
      *      `icjp1 = (icj * (i - j)) / (j + 1)`
      *    - This avoids recalculating factorials every time and builds the next value from the current one.
      *    - Initialize `icj = 1` at the start of every row because the first value is always 1.
 
      * 🔍 NOTE:
      * - Pascal’s Triangle has symmetry.
      * - Each row contains coefficients of binomial expansion:  
      *   Example: Row 3 → (a + b)^3 = 1a³ + 3a²b + 3ab² + 1b³
         */

        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        // ROWS
        for (int i = 0; i < total_rows; i++) {
            int icj = 1;
            // COLUMNS
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                // PERMUTATION FORMULA
                int icjp1 = (icj * (i - j)) / (j + 1);
                icj = icjp1;

            }
            System.out.println();
        }

    }
}
