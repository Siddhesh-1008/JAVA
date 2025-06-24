
import java.util.*;

public class Lec14 {
    // WAP TO INVERSE A ORIGINAL INPUT NUMBER

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // INITIALIZE INVERSE AND ORIGINAL POSITION
        int inverse = 0;
        int orgnl_pos = 1;

        while (number != 0) {

            int orgn_digit = number % 10;
            int inverse_pos = orgn_digit;
            int inverse_digit = orgnl_pos;

            // MAKE CHANGE TO INV USING IP AND ID
            inverse = inverse + inverse_digit * (int) Math.pow(10, inverse_pos - 1);

            number = number / 10;
            orgnl_pos++;
        }

        System.out.print(inverse);

    }
}
