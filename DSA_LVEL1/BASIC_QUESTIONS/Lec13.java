
import java.util.*;

public class Lec13 {
    // WAP TO PRINT A GIVEN NUMBER IN REVERSE ORDER

    public static void main(String[] args) {
        /*
    🔁 How it works:
    Input a number from the user.
    Use a while loop to:
    Get the last digit using number % 10.
    Print that digit.
    Remove the last digit from the number using number = number / 10.
    Repeat until the number becomes 0.

         */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number != 0) {

            int last_digit = number % 10;
            System.out.print(last_digit + " ");
            number = number / 10;

        }
    }
}
