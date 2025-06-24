
import java.util.*;

// PRINT MULTIPLICATIONT TABLE OF A PARTICULAR NUMBER
public class Lec14 {
  /*as
   SUMMARY
   UNDERSTANDING:-
    •	IF U OBSERVED CAREFULLY IN THIS INPUT NUMBER IS CONSTANT WHILE ITS i GETS CAHNGE CONTINUOUSLY 
    o	LOOP WILL RUN FROM 1 TO LESS THAN 11 AND THEN MULTIPLY IT WITH INPUT NUMBER TO GET OUTPUT
   */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + "= " + number * i);
        }

    }
}
