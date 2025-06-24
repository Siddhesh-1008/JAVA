
import java.util.*;

public class LEC1 {
// PRINT STARS AS PER CURRENT ROW NUMBER

    /*
 * 📌 SUMMARY:
 * This program prints a **right-angled triangle pattern** of stars (*),
 * where the number of stars in each row equals the row number.
 *
 * ✅ HOW IT WORKS:
 * 1. Takes total number of rows as input from the user.
 * 2. Outer loop (`i`) runs from 1 to total_rows (for each row).
 * 3. Inner loop (`j`) prints `i` stars in the `i-th` row.
 * 4. Each star is printed with a tab space ("\t") for better formatting.
 *
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        for (int i = 1; i <= total_rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }
}
