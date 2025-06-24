
import java.util.*;

public class Lec7 {
    // BASE SUBTRACTION

    public static int converter(int number1, int number2, int base) {
        int borrow = 0;
        int sum = 0;
        int power = 1;

        while (number2 > 0) {
            // REMAINDER AND QUOTIENT
            int digit2 = number2 % 10;
            number2 /= 10;
            int digit1 = number1 % 10;
            number1 /= 10;

            int d = 0;
            digit2 = digit2 + borrow;

            // REMAINDER 2> REMAINDER 1
            if (digit2 >= digit1) {
                borrow = 0;
                d = digit2 - digit1;
            } else {
                borrow = -1;
                d = digit2 + base - digit1;
            }

            // REVERSE NUMBER
            sum = sum + d * power;
            power *= 10;

        }
        return sum;

    }

    public static void main(String[] args) {
        /*
SUMMARY
IF U OBSERVE CLEARLY THERE IS A PATTERN OF NUMBER 2,NUMBER 1|BORROW|SUBTRACTION OF REMAINDER
    •	WHILE LOOP RUN UNTIL LARGEST NUMBER DOESN’T GETS EQL TO ZERO
    •	THEN GET REMAINDER FOR TWO NUMBERS BY DOING EACH NUMBER MODULUS BY 10
    •	AND THEN GET QUOTIENT FOR TWO NUMBERS BY DOING DIVIDE TO REDUCE THE NUMBER
    •	THEN CREATE A DEMO VARIABLE D AND ASSIGNED ZERO TO IT
    •	THEN ADD PREVIOUS BORROW TO RAMAINDER 2 OF DIGIT2 MODULUS 10
      •	THEN CHECK WHETER REMAINDER OF LARGER NUMBER IS GREATER THAN OR EQL TO REAMAINDER OF SMALLER NUMBER
        o	IF SO BORROW MUST BE ZERO THEN SUBTRACT  REMAINDER 2 AND REMAINDER 1
        	REMAINDER2-REMAINDER1
      •	IF REAMAINDER OF LARGER NUMBER IS SMALLER THAN OR EQL TO REAMAINDER OF SMALLER NUMBER
        o	THEN BORROW MUST BE -1 AND ADD BASE AND SUBTRACT  REMAINDER 2 AND REMAINDER 1 
        	REMAINDER_2+BASE-REMAINDER_1
    NOTE:-BUT BEFORE IT ADD PREVIOUS BORROW TO REMAINDER 2
    •	THEN MULTIPLY THE SUBTRACTION OF REMAINDER WITH INCREASING POWER OF 10
         */
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int base = input.nextInt();

        int result = converter(number1, number2, base);
        System.out.println("CONVERTER:- " + result);

    }

}
