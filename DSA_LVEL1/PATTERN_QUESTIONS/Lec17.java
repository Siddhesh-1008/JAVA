
import java.util.*;

public class Lec17 {
    // WAP TO PRINT RIGHT ARROW

    public static void main(String[] args) {
        /*
UNDERSTANDING

UNDERSTANDING:-
•	IF U SEE CAREFULLY THERE IS PATTERN IN SPACES AND STARS
•	HERE WE DIVIDE THE ARROWS INTO TWO PARTS ITS TAIL AND ARROW ONE
  •	ARROW PART
    o	ARROW ONE HAVE STAR PATTERN WHICH WE STUDIED EARLIER IN EVERY PATTERN
      	THAT TILL MIDDLE ROW STARS ARE INCREMENTING BY 1 AND THEN IT DECREMENT BY 1
•	TAIL PART
    o	TILL MIDDLE ROW SPACES ARE PRINTED SAME THAT IS TOTAL_ROWS/2 AND AFTERWORDS IT PRINTED STARS AND THEN AGAIN SPACES
•	THAT MEANS FIRST PRINT SPACES THEN STARS AND THEN WRITE A CHECK LOGIC FOR INCREMENTING AND DECREMENTING STARS 

•	SIMILARLY FOR SPACES LOOP WE NEED TO WRITE CHECK LOGIC WHERE WE PRINT STARS TILL MIDDLE ROW AND THEN STARS AND THEN AGAIN SPACES


         */
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int spaces = total_rows / 2;
        int stars = 1;

        for (int i = 1; i <= total_rows; i++) {

            // SPACES
            for (int j = 1; j <= spaces; j++) {
                // CHECK FOR MIDDLE ROW
                if (i == total_rows / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }

            // STARS
            for (int k = 1; k <= stars; k++) {
                System.out.print("*\t");
            }

            // CHECK
            if (i <= total_rows / 2) {
                stars++;
            } else {
                stars--;
            }

            System.out.println();
        }

    }
}
