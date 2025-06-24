
import java.util.*;

public class Lec18 {

    public static void main(String[] args) {
        /*
UNDERSTANDING:-
•	IF U OBSERVED CAREFULLY THERE IS A PATTERN IN SPACES AND STARS
•	FIRST PRINT FILLED STAR PATTERN THEN GO FOR SPACES IN IT
•	FILLED STAR PATTERN
    o	IF WE SEE CAREFULLY SPACES ARE INCREASING BY 1 TILL MIDDLE ROW AND ARE DECREMENTING BY 1 AFTER MIDDLE ROW
    o	IF WE SEE CAREFULLY STARS ARE DECREMENTING BY 2 TILL MIDDLE TOW AND ARE INCREMENTING BY 2 AFTER MIDDLE ROW
•	SPACES IN MIDDLE HALF PATTERN
    o	IF WE SEE IN MIDDLE HALF PATTERN SPACES ARE PRESENT IN ROWS ARE GREATER THAN STAR ROW AND SMALLER THAN MIDDLE ROW
    o	AND AS WELL AS SPACES ARE PRESENT AFTER FIRST POSITION IN ROW AND BEFORE LAST POSITION IN ROW

         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();
        int spaces = 0;
        int stars = total_rows;

        for (int i = 1; i <= total_rows; i++) {

            //SPACES(ROWS)
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            // STARS(ROWS)
            for (int k = 1; k <= stars; k++) {
                // CHECK FOR INSIDE SPACES
                if (i > 1 && i < (total_rows / 2 + 1) && k > 1 && k < stars) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }

            }

            // CHECK FOR INCREMENTING AND DECREMENTING
            if (i <= total_rows / 2) {
                spaces++;
                stars -= 2;
            } else {
                spaces--;
                stars += 2;
            }

            System.out.println();
        }

    }
}
