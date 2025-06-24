
import java.util.*;

public class Lec19 {

    public static void main(String[] args) {
        /*
SUMMARY:-
UNDERSTANDING
•	IF U OBSERVE CAREFULLY THE CODE IS ALL ABOUT UNDESRTANDING ROWS AND WHAT ONE MUST PRINT IN EACH ROW
•	IF U SEE CAREFULLY EACH ROW LOOP WILL RUN FOR TOTAL NUMBER OF ROWS GIVEN
•	NOW DIVIDE THE TOTAL ROWS INTO DIFFERENT PATS
FIRST PART
    •	THIS WILL COVER FIRST ROW
      o	STARS ARE PRINTED AT LAST COLUMN AND TILL TOTAL_ROWS/2+1
      o	ELSE SPACE
SECOND PART
    •	THIS WILL COVER ROWS BETWEEN START ROW AND MIDDLE ROWS
      o	STARS ARE PRINTED AT TOTAL_ROWS/2++1 AND LAST COLUMN
      o	ELSE SPACE
THIRD PART
    •	THIS WILL COVER ROWS AT POSTION TOTAL_ROWS/2++1
      o	STARS ARE PRINTED WHOLE ROW /OR AT ALL COLUMNS
FOURTH PART
    •	THIS WILL COVER ROWS BETWEEN OR AFTER TOTAL_ROWS/2++1 AND LAST ROW
      o	HERE STARS ARE PRINTED AT FIRST COL AND TOTAL_ROWS/2++1
      o	ELSE SPACES
FIFTH PART
  •	THIS WILL BE THE LAST ROW
    o	STARS ARE PRINTED AT FIRST COL AND AFTER TOTAL_ROWS/2+1 TILL END

         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        // ROWS
        for (int i = 1; i <= total_rows; i++) {

            // COLUMNS
            for (int j = 1; j <= total_rows; j++) {
                // FIRST PART
                if (i == 1) {
                    // STARS
                    if (j == total_rows || j <= total_rows / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }

                } // SECOND PART
                else if (i <= total_rows / 2) {
                    // STARS
                    if (j == total_rows || j == total_rows / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } // THIRD PART
                else if (i == total_rows / 2 + 1) {
                    // STARS
                    System.out.print("*\t");

                } // FOURTH PART
                else if (i < total_rows) {
                    // STARS
                    if (j == 1 || j == total_rows / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } // FIFTH PART
                else {
                    // STARS
                    if (j == 1 || j >= total_rows / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

            }
            System.out.println();
        }
    }
}
