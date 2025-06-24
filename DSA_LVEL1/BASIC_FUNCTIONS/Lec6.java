
import java.util.*;

public class Lec6 {

    // BASE ADDITION
    public static int base_addition(int num1, int num2, int base) {
        int sum = 0;
        int power = 1;
        int carry = 0;

        while (num1 != 0 || num2 != 0 || carry != 0) {
            // REMAINDERS
            int r1 = num1 % 10;
            int r2 = num2 % 10;
            // REDUCTION OF DIIGTS
            num1 = num1 / 10;
            num2 = num2 / 10;

            // REMAINDER ADDTION
            int addition = r1 + r2 + carry;

            carry = addition / base;
            int dig = addition % base;
            sum = sum + dig * power;
            power = power * 10;

        }

        return sum;
    }

    public static void main(String[] args) {
        /*
SUMMARY
UNDERSTANDING:-
    IF U OBSERVED CAREFULLY IT IS ADDITION TWONUMBERS WITH SAME BASE
    •	HERE WE NEED TO RUN A WHILE LOOP UNTIL CARRY REAMINDER AND QUOTIENT DOESNOT BECOMES ZERO
    •	THEN CONTINUOUS MODULUS FIRST AND SECOND NUMBER THEN STORE EACH REMAINDER AND THEN ADD BOTH THE REMAINDERS AND STORE IT IN SUM VARAIBLE 
          o	NOTE AS WELL AS DON’T FORGET TO ADD CARRY IN IT
    •	NOW CARRY IS CALCULATED BY DIVIDING THE SUM AND GET ITS QUOTIENT AND ALSO MODULUS THE SUM AND GET ITS REMAINDER  NOW STORE IT IN VARAIBLE CARRY AND DIGIT 
    •	THEN MULTIPLY THE DIGIT WITH INCREASING POWERS OF 10 TO PRINT DIGITS IN REVERSE ORDER


         */
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int base = input.nextInt();
        int result = base_addition(num1, num2, base);
        System.out.println("BASE ADDITION:- " + result);

    }

}
