
import java.util.*;

public class Lec5 {

    // ANY BASE TO DECIMAL
    public static int base_to_decimal(int number, int base1) {
        int sum = 0;
        int power = 1;
        while (number != 0) {
            int dig = number % 10;
            number = number / 10;
            sum = sum + dig * power;
            power = power * base1;

        }

        return sum;

    }

    // DECIMAL TO BASE
    public static int decimal_to_base(int number, int base2) {
        int sum = 0;
        int power = 1;
        while (number != 0) {
            int dig = number % base2;
            number = number / base2;
            sum = sum + dig * power;
            power = power * 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int base1 = input.nextInt();
        int base2 = input.nextInt();
        int num1 = base_to_decimal(number, base1);
        System.out.println("CONVERSION:- " + num1);
        int result = decimal_to_base(num1, base2);
        System.out.println("CONVERSION :- " + result);
    }
}
