
import java.util.*;

public class Lec8_WA_Prime {

    public static void main(String[] args) {
// Summary:
// The code asks how many numbers the user wants to check (t).
// It then runs a loop t times to take each number.
// For each number, it counts how many numbers divide it completely.
// If the number has only 2 divisors (1 and itself), it is prime.
// It prints "PRIME NUMBER" or "NOT A PRIME NUMBER" accordingly.
// NOT OPTIMIZED SLUTION
        Scanner input = new Scanner(System.in);
        System.out.println("NUMBER OF TIMES U WANT TO TAKE INPUT");
        int t = input.nextInt();

        // NOT OPTIMIZED SOLUTION
        // for (int i = 1; i <= t; i++) {
        //     int num = input.nextInt();
        //     int count = 0;
        //     for (int div = 1; div <= num; div++) {
        //         if (num % div == 0) {
        //             count = count + 1;
        //         }
        //     }
        //     if (count == 2) {
        //         System.out.println("PRIME NUMBER");
        //     } else {
        //         System.out.println("NOT APRIME NUMBER");
        //     }
        
        // OPTIMIZED SOLUTION
        // ✅ Summary of the Code:
        // This code checks whether a number is prime or not, for t numbers given by the user.
        // It takes t as input (number of test cases).
        // For each number:
        // It checks if the number is divisible by any number from 2 to √num.
        // If divisible, it's not prime.
        // If not divisible by any number in that range, it's prime.
        // Using Math.sqrt(num) makes it faster by reducing unnecessary checks.
        for (int i = 1; i <= t; i++) {
            System.out.print("ENTER NUMBER:- ");
            int num = input.nextInt();

            int count = 0;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    count++;
                    break;
                }
            }
            System.out.println(count);

            if (count == 0) {
                System.out.println("PRIME");
            } else {
                System.out.println("NOT PRIME");
            }

        }
    }

}
