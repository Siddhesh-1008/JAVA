
import java.util.Scanner;

public class Lec9 {
// WAP TO PRINT CROSS DIAGONAL

    public static void main(String[] args) {
        /*
🎯 OBJECTIVE:
* - Display an X pattern made of stars (*) on a square grid.
* - The grid size (rows = columns) is taken as user input.
    
  🧠 LOGIC:
    1. Outer loop runs from `1 to total_rows` (each row).
    2. Inner loop runs from `1 to total_rows` (each column in that row).
  	3. Inside the inner loop:
        ->> If `i == j` → print star on the **main diagonal** (top-left to bottom-right).
    
        ->> Else if `i + j == total_rows + 1` → print star on the **reverse diagonal** (top-right to bottom-left).
        ->> Else → print a tab (`\t`) to maintain spacing.
 
🔍 NOTE:
  - For odd total_rows: Diagonals intersect at the center.
  - For even total_rows: Diagonals do not intersect at a single cell, causing a wider gap in the middle — this is mathematically normal.
 

         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        for (int i = 1; i <= total_rows; i++) {
            for (int j = 1; j <= total_rows; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else if (i + j == total_rows + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

}
