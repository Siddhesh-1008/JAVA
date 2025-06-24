
import java.util.*;

public class Lec4 {

    // CONVERT BASE TO DECIMAL  
    public static int converter(int number, int base) {
        /*
SUMMARY
Continuously modulus and divide the number by 10 (to extract each digit), and multiply each digit by increasing powers of the base.
Finally, add all results to get the decimal number.


    •	IF U OBSERVE CAREFULLY WE CAN OBSERVE THERE IS QUOTIENT REMAINDER PATTERN
    •	WHERE WHILE LOOP WILL RUN UNTIL QUOTIENT NOT GETS EQUAL TO ZERO
    •	HERE WE SAVE THE REMAINDER(NUMBER MODULUS BY 10)IN DIG AND THEN MULTIPLY IT BY INCREASING POWER(BASE)
    •	IF BASE IS 8
        o	FIRST REMAINDER 1172 MODULUS BY 10 IS 2 THEN 2*8^0 AND POWER WILL BE 1
        o	FIRST REMAINDER 1172 MODULUS BY 10 IS 7 THEN 7*8 AND POWER WILL BE 8
        o	FIRST REMAINDER 1172 MODULUS BY 10 IS 1 THEN 7*8^2 AND POWER WILL BE 64
        o	FIRST REMAINDER 1172 MODULUS BY 10 IS 1 THEN 2*8^3 AND POWER WILL BE 512
    •	THEN ADD ALL 
    •	THIS DIGIT*POWER INTO SUM

         */

        int power = 1;
        int sum = 0;
        while (number != 0) {
            // BASE TO DECIMAL
            int digit = number % 10;
            number = number / 10;
            sum = sum + digit * power;
            power = power * base;
        }
        return sum;

    }

    public static void main(String[] args) {
        /*
      TIP
     * DECIMAL TO BASE DIVIDE AND MODULUS BY BASE AND MULTIPLY BY 10
     * BASE TO DECIMAL DIVIDE AND MODULUS BY 10 AND MULTIPLY BY BASE
         */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int base = input.nextInt();
        int result = converter(number, base);
        System.out.println("CONVERTER:- " + result);

    }
}
