
import java.util.*;

public class Lec20 {

    public static void main(String[] args) {
        /*
UNDERSTANDING
•	IF WE SEE CAREFULLY WE NEED TO JUST UNDERSTAND WHERE WE NEED TO PRINT STAR
•	IF WE SEE PROERLY PATTERN STARS ARE PRINTED AT START AND END COL AND IN LEFT TO BOTTOM HALF DIAGONAL AND RIGHT TO BOTTOM HALF DIAGONAL 
•	NOW WEE NEED TO DECIDE AT WHICH ROW WE NEED TO PRINT STARS AT FIRST,END OR AT HALF DIAGONALS
•	BEFORE MIDDLE ROW 
  o	ALL STARS ARE PRINTED AT START AND END COLUMN
•	AFTER MIDDLE ROW 
  o	STARS ARE PRINTED AT LEFT TO BOTTOM HALF DIAGONAL AND RIGHT TO BOTTOM HALF DIAGONAL  AND START AND END COLUMN

         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        // ROWS
        for (int i = 1; i <= total_rows; i++) {

            // COLUMNS
            for (int j = 1; j <= total_rows; j++) {
                // STARS PRINTING ON WHICH COMUMN
                if (j == 1 || j == total_rows) {
                    System.out.print("*\t");
                } else if (i > total_rows / 2 && (i == j || i + j == total_rows + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
