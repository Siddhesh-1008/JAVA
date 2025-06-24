
import java.util.*;

public class Lec3 {
// DECIMAL TO ANY BASE NUMBER

// DECIMAL TO BASE CONVETER LOGIC
    public static int converter(int number, int base) {
        int sum = 0;
        int power = 1;
        // QUOTIENT|REMAINDER PATTERN
        while (number != 0) {
            int digit = number % base;
            number = number / base;

            sum = sum + digit * power;
            power = power * 10;

        }

        return sum;

    }

    public static void main(String[] args) {
        /*
SUMMARY
TIP:-FOR CONVERTING DECIMAL TO ANY BASE NUMBER WE NEED TO CONTINUOUSLY DIVIDE THE NUMBER BY BASE NUMBER AND WHAT WILL BE THE REMAINDER JUST REVERSE IT 
    o	IF WE OBSERVED CLEARLY THERE IS A QUOTIENT AND REAMINDER PATTERN PRESENT
    o	WE HAD USE WHILE LOOP AND THIS LOOP WILL RUN UNTIL QUOTIENT DOESN’T GETS EQUL TO ZERO
    o	THEN DO MODULUS OF NUMBER AND STORE THE LAST DIGIT IN DIG AND THEN MULTIPLY THE DIG WITH INCREASE POWER(THAT IS 10^POWER)
    o	MEANS
          o	FOR FIRST REMAINDER IT IS 2 THEN 2 *10^0
          o	FOR SECOND REMAINDER IT IS 7 THEN 7 *10^1
          o	FOR THIRD REMAINDER IT IS 1 THEN 1 *10^2
          o	FOR FOURTH REMAINDER IT IS 1 THEN 1 *10^3
          o	FOR FIFTH REMAINDER IT IS 0 THEN 0 *10^0
    o	AND NOW JUST ADD ALL REMAINDER*POWER AND THEN RETURN THE VALUE

         */
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int base = input.nextInt();
        int result = converter(number, base);
        System.out.println("DECIMAL_TO_ANY_BASE:- " + result);

    }

}
