
import java.util.*;

public class Lec9 {

    /*
    * U ARE GIVEN HIGH AND LOW RANGE
   * find all the primes numbers between HIGH AND LOW RANGE BOTH INCLUDED
     */
    public static void main(String[] args) {
        /*     This Java program takes a higher and lower range as user input and prints all prime numbers between the two values (inclusive).
         Key Features:
        Uses Scanner to read user input for the range.
        Loops through all numbers between the given range.
        Checks each number for primality by dividing it from 2 to √n. 
        Prints the number if it is prime
         */

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER HIGHER RANGE:- ");
        int higher_Range = input.nextInt();
        System.out.print("ENTER LOWER RANGE:- ");
        int lower_Range = input.nextInt();

        for (int i = higher_Range; i <= lower_Range; i++) {
            int count = 0;

            // TYR TO DIVIDE i WITH EVERY NUMBER FROM 2 TO ROOT i AND INCREASE COUNT
            for (int div = 2; div * div <= i; div++) {
                // IF IT GET DIVIDE BY ANY NUMBER IN RANGE JUSTINCREMENT THE COUNT AND BREAK
                if (i % div == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i);
            }

        }

    }
}
