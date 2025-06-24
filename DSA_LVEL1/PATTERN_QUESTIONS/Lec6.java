
import java.util.*;

// PRINT HOLLOW DIAMOND
public class Lec6 {

    /*
SUMMARY
FIRST INTIALIZE SPACES AND STARS ACCORDING TO THE PATTERN
  IF U OBSERVED CARREFULLY THERE IS PARTICULAR PATTERN IN SPACES STARS 
  IF WE SEE PROPERLY STARS ARE DECREASING BY 1 TILL MIDDLE ROW AND THEN INCREASE BY 1
  SIMILAR FOR SPACES SPACES ARE INCREASED BY 2 TILL MIDDLE ROW AND THEN DECREASE BY 2
  FOR AGAIN STARS STARS ARE DECREASING BY 1 TILL MIDDLE ROW AND THEN INCREASE BY 1

      SO WE NEED TO MAKE CHECKS WHERE WE MUST NEED TO INCREASE AND DECREASE
        TILL MIDDLE ROW STARS--AND SPACES+=2
        AFTER MIDDLE ROW STARS++ AND SPACES-=2
    
  THEN DO PRINTLN FOR GETTING INTO NEXT LINE

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        int stars = total_rows / 2 + 1;
        int spaces = 1;

        for (int i = 1; i <= total_rows; i++) {
            // System.out.println(stars + " " + spaces + " " + stars);

            // STARS
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            // SPACES
            for (int k = 1; k <= spaces; k++) {
                System.out.print("\t");
            }

            //STARS
            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            // CHECK
            if (i <= total_rows / 2) {
                stars--;
                spaces += 2;
            } else {
                spaces -= 2;
                stars += 1;
            }

            System.out.println();
        }

    }
}
