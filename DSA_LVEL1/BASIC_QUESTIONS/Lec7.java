
import java.util.*;

public class Lec7 {

    public static void main(String[] args) {
        /*
     * WHEN U WANT TO GET INPUT INTEGER THEN USE nextInt()
     * WHEN U WANT TO GET STRING VALUE THEN USE nextLine()
     * WHEN U WANT TO USE BOTH THEN FIRST PARSE IT TO READ NUMBER AS WELL AS ENTER KEY AND THEN GO TO NEXT LINE
         */
        // Scanner input=new Scanner(System.in);
        // int number=input.nextInt();
        // System.out.println(number);

        // String name=input.nextLine();
        // System.out.println(name);
        /*
         * What actually happens:
          nextInt() reads 5, but leaves the ENTER key (newline \n) in memory.
          nextLine() sees that leftover ENTER and thinks you're done typing, so it returns an empty string "".
         */
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine()); // reads number and ENTER together
        String name = input.nextLine();// now waits for actual name
        System.out.println(name + "," + number);

    }
}
