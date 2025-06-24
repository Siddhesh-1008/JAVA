
import java.util.*;

public class Lec17 {
    // PRINT PRIME FACTORS OF GIVEN NUMBER

    public static void main(String[] args) {
        /*
      * 📌 SUMMARY: PRIME FACTORIZATION
      * This program prints the prime factorization of a given number.
      *
      * ✅ HOW IT WORKS:
      * 1. Start dividing the input number `n` from 2 (smallest prime).
      * 2. If `n` is divisible by the current divisor `div`, print it and divide `n` by `div`.
      * 3. Keep dividing by the same `div` until it no longer divides `n`.
      * 4. Then increase `div` to check for the next possible prime factor.
      * 5. Loop continues while div*div <= n (we don’t need to check beyond √n).
      * 6. If after the loop, `n` is still > 1, it means `n` itself is a prime number 
      *    and should be printed (this handles cases like 13, 17, 29, etc).

    * 🧠 Example:
    * Input: 60
    * Output: 2 2 3 5
    * (Because 60 = 2 × 2 × 3 × 5)
         */

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int div = 2; div <= Math.sqrt(number); div++) {

            // IF BELOW LOOP !=0 THEN INCREMENT DIV BY 1
            while (number % div == 0) {
                // TO REDUCE QUOTEINT
                number = number / div;
                System.out.print(div + " ");
            }

        }
        if (number != 1) {
            System.out.print(number + " ");
        }

    }
}
