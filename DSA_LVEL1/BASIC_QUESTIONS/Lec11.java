
import java.util.Scanner;

public class Lec11 {

    public static void main(String[] args) {
        /*
      📝 Program Summary: Count Digits in a Number
      This Java program reads an integer input from the user and counts the total number of digits in that number.

      📌 Key Features:
      1.)Uses Scanner to take user input.
      2.)Uses a while loop to repeatedly divide the number by 10.
      3.)In each iteration, it increments the count_digits variable.
      4.)Continues until the number becomes 0, at which point all digits have been counted.
      5.)Prints the total number of digits in the input number.
         */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count_digits = 0;

        while (number != 0) {
            // System.out.println(number %10);
            count_digits += 1;
            number = number / 10;
        }
        System.out.print("TOTAL DIGITS:- " + count_digits);

    }
}
