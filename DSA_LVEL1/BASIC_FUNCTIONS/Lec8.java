
import java.util.*;

public class Lec8 {

    // MAINN FUNCTION
    public static int getProduct(int base, int num1, int num2) {

        int rv = 0;
        int power = 1;
        while (num2 > 0) {
            int ld1 = num2 % 10;
            num2 = num2 / 10;
            int mul1 = single_product_mul(base, num1, ld1);
            System.out.println(mul1);
            rv = base_addition(base, rv, mul1 * power);
            power = power * 10;
        }
        return rv;
    }

    // SINGLE PRODUCT MULTIPLICATION
    public static int single_product_mul(int base, int num1, int ld1) {

        int carry = 0;
        int rv = 0;
        int power = 1;

        while (num1 > 0 || carry > 0) {
            int ld2 = num1 % 10;
            num1 = num1 / 10;

            int d = ld2 * ld1 + carry;

            carry = d / base;
            int dig = d % base;

            rv = rv + dig * power;
            power = power * 10;
            
        }

        return rv;

    }

    // BASE ADDITON
    public static int base_addition(int base, int num1, int num2) {
        int power = 1;
        int carry = 0;
        int rv = 0;

        // CHECK LOOP
        while (num1 > 0 || num2 > 0 || carry > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;

            int addition = d1 + d2 + carry;

            carry = addition / base;
            int dig = addition % base;

            rv = rv + dig * power;
            power = power * 10;
        }

        return rv;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int base = input.nextInt();
        int result = getProduct(base, num1, num2);
        System.out.println("BASE_MULTIPLICATION:- " + result);

    }
}
