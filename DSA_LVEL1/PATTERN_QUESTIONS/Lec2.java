
import java.util.*;

public class Lec2 {
    // PRINT REVERSE RIGHT ANGLE TRIANGLE PATTERN

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        for (int i = total_rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
    }

}
