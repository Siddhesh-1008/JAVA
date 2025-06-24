
import java.util.*;

public class Lec15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int rotation_index = input.nextInt();
        int temp = number;

        // GET TOTAL NUMBER OF DIGITS IN A NUMBER
        int no_of_digts = 0;
        while (temp != 0) {
            temp = temp / 10;
            no_of_digts++;
        }

        System.out.println("no_of_digts:- " + no_of_digts);

        // FOR NEGATIVE INDEX
        // WHEN ROTATION INDEX IS GREATER THAN NO_OF_DIGITS
        rotation_index = rotation_index % no_of_digts;

        // INDEX ROTATION INDEX
        if (rotation_index < 0) {
            rotation_index = rotation_index + no_of_digts;
        }

        // TO GET DIV AND MULTIPLIER
        int div = 1;
        int mul = 1;
        for (int i = 1; i <= no_of_digts; i++) {
            if (i <= rotation_index) {
                div = div * 10;
            } else {
                mul = mul * 10;
            }
        }
        System.out.println("DIV->" + div + "\nMUL->" + mul);

        // GET REMAINING AND LAST DIGIT NUMBER
        int remaining_number = number / div;
        int last_digit = number % div;

        int result = last_digit * mul + remaining_number;

        System.out.println("ROTAION AT PARTICULAR INDEX:- " + result);
    }

}
