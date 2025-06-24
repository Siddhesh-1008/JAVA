
import java.util.*;

public class Lec8_WA_Prime_not_ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("NUMBER OF TIMES U WANT TO TAKE INPUT");
        int t = input.nextInt();

        for (int i = 1; i <= t; i++) {
            int num = input.nextInt();

            int count = 0;
            for (int div = 1; div <= num; div++) {
                if (num % div == 0) {
                    count = count + 1;
                }
            }

            if (count == 2) {
                System.out.println("PRIME NUMBER");
            } else {
                System.out.println("NOT APRIME NUMBER");
            }
        }

    }
}
