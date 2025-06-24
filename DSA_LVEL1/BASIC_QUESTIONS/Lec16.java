
import java.util.*;

public class Lec16 {

    // FIND GCD AND LCM OF NUMBERS
    // GCD= FIND GREATEST NUMBER THAT DIVIDES BOTH NUMBERS
    // LCM= FIND LEAST NUMBER THAT COMES IN MULTIPLE OF BOTH TABLE 
    public static void main(String[] args) {
        /*
 * 📌 SUMMARY:
            * This program calculates the GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
            * of two given numbers using the Euclidean Algorithm.
            
            * ✅ STEPS:
            * 1. Take two numbers as input.
            * 2. Store the original values for LCM calculation.
            * 3. Use a loop to apply Euclidean Algorithm:
            *    - Divide the larger number by the smaller one.
            *    - Save the remainder.
            *    - Replace the larger number with the smaller one.
            *    - Replace the smaller one with the remainder.
            *    - Repeat until remainder becomes 0.
            * 4. The last non-zero number is the GCD.
            * 5. Use the formula: LCM = (original_n1 * original_n2) / GCD
            * 6. Print both GCD and LCM.
            
            * 🧠 Tip:
            * - GCD helps find common factors.
            * - LCM helps find a common multiple for timing or syncing problems.
         */

        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int original1 = number1;
        int original2 = number2;

        // n2|n1
        while (number1 % number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }

        int gcd = number2;
        int lcm = (original1 * original2) / gcd;

        System.out.print("UR GCD NUMBER IS:-" + gcd + "\nUR LCM IS:-" + lcm);

    }
}
