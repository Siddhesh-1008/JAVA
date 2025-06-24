
import java.util.*;

public class Lec4 {

    public static void main(String[] args) {

        /*
       * 🧠 ALGORITHM EXPLANATION:
        * 1. Initialize:
        *    - `stars = total_rows`
        *    - `spaces = 0`
        * 
        * 2. Loop `i` from 1 to total_rows:
        *    a. Print spaces using a loop from 1 to `spaces`.
        *    b. Print stars using a loop from 1 to `stars`.
        *    c. Move to the next line.
        *    d. After each row:
        *       - Increase `spaces` by 1
        *       - Decrease `stars` by 1

  * 🔁 LOOP STRUCTURE:
  * - Outer loop (i): Runs once per row.
  * - Inner loop 1 (spaces): Prints tabs `\t` → starts from 0, increments each row.
  * - Inner loop 2 (stars): Prints stars `*` → starts from total_rows, decrements each row.
  
  * ✅ OUTPUT:
  * Each line starts with increasing spaces and decreasing stars to create a **left-aligned triangle shrinking downwards**.
         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int stars = total_rows;
        int spaces = 0;
        for (int i = 1; i <= total_rows; i++) {

            // SPACES
            for (int k = 1; k <= spaces; k++) {
                System.out.print("\t");

            }

            // STARS
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();

            stars--;
            spaces++;

        }
    }
}
