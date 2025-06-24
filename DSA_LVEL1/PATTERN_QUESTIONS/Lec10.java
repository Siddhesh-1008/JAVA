
import java.util.*;

public class Lec10 {
    // PRINT HOLLOW DIAMOND PATTERN

    public static void main(String[] args) {
        /*
        •	IF U OBSERVED CAREFULLY THERE IS A PATTERN FOR OUTER SPACE AND INNER SPACE
        •	OUTER SPACES ARE DECREASING BY 1 TILL MIDDLE ROW AND THEN THEY ARE INCREASING BY 1 AFTER MIDDLE ROW
        •	INNERSPACES ARE INCREASING BY 2 TILL MIDDLE ROW AND THEN ARE DECREASING BY 2 AFTER MIDDLE ROWS
        •	AND ONE STAR IS PRINTED  AFTER EVERY OUTER SPACES AND INNER SPACES
        •	EXCEPT FIRST AND LAST ROW AS HERE WE PRINTED ONLY ONE STAR AFTER OUTER SPACE AND NO STAR AFTER INNER SPACES

         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int outer_spaces = total_rows / 2 ;
        int inner_spaces = -1;
        for (int i = 1; i <= total_rows; i++) {
            // System.out.print(outer_spaces);

            // OUTER SPACES
            for (int j = 1; j <= outer_spaces; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            //Inner spaces
            for (int k = 1; k <= inner_spaces; k++) {
                System.out.print("\t");
            }

            // CHECK FOR FIRST AND LAST ROW
            if (i > 1 && i < total_rows) {
                System.out.print("*\t");
            } else {
                System.out.print("");
            }

            // CHECK FOR INCREMENTING AND DECREMENTING
            if (i <= total_rows / 2) {
                outer_spaces--;
                inner_spaces += 2;
            } else {
                outer_spaces++;
                inner_spaces -= 2;
            }
            System.out.println();
        }
    }
}
