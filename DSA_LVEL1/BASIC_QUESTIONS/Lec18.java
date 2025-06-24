
import java.util.Scanner;

public class Lec18 {

    /*
   * GIVEN THREE NUMBERS WE NEED TO DEFINE WHETER IT IS A RIGHT ANGLE TRIANLGE OR NOT
     */
    public static void main(String[] args) {
        /*
       * SUMMARY
        FIRST FIND HIGHEST NUMBER IN ALL THREE NUMBERS AND ASIGN IT HAS MAX
        THEN APPLY FORMUAL BASED ON MAX 
              BASE^2 + HEIGHT^2=MAX^2

         */
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = num1;

        if (num2 >= max) {
            max = num2;
        }

        if (num3 >= max) {
            max = num3;
        }

        if (max == num1) {
            boolean flag = ((num2 * num2 + num3 * num3) == (max * max));
            System.out.println(flag);
        } else if (max == num2) {
            boolean flag = ((num1 * num1 + num3 * num3) == (max * max));
            System.out.println(flag);
        } else {
            boolean flag = ((num2 * num2 + num1 * num1) == (max * max));
            System.out.println(flag);
        }
    }
}
