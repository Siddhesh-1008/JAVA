
import java.util.Scanner;

public class Lec9 {
    // ROTATE AN ARRAY

    // Swapping logic
    public static void reverse(int[] array, int i, int j) {

        int left_index = i;
        int right_index = j;
        while (left_index < right_index) {
            int temp = array[right_index];
            array[right_index] = array[left_index];
            array[left_index] = temp;

            left_index++;
            right_index--;
        }

    }

    // ROTATE ARRAY K TIMES
    public static void rotate_array(int[] array, int k) {
        // POSITIVE ROTATION HANDLING
        k = k % array.length;

        // NEGATIVE ROTATION HANDLING
        if (k < 0) {
            k += array.length;
        }

        // PART 1
        reverse(array, 0, array.length - k - 1);

        // PART2
        reverse(array, array.length - k, array.length - 1);

        // WHOLE PART
        reverse(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        /*
UNDERSTANDING:-
IN SIMPLE WORDS DIVIDE THE STRING INTO TWO PARTS THEN APPLY REVERSE TO EACH PART
•	ROTATE FUNCTION
  o	FIRST HANLE NEGATIVE ROTATION
  o	NEGTIVE ROTATION	
    	FOR NEGATIVE ROTATION WE JUST ADD NEGTIVE ROTATION TO ARRAYS LENGTH
    	MEANS
      •	AS K=-1 IS EQL TO K=4 ROTATIONS
o	AND FOR POSTIVE ROTATION
    	TOTAL ROATION MODULUS 10
    	MEANS
      •	AND IF WE OBSERVE AFTER EVERY 5 ROTATIONS WE GET ORIGINAL STRING AGAIN
      •	FOR 11 ROTATION means 11%10=1 DOES WEE NEED TO DO JUST 1 ROTATION MEANS 11 ROTATION IS EQL TO 1 ROTATION
o	FIRST PART WILL START FROM 0 TO ARRAYS LENGTH-ROTATION NUMBER-1
    	THEN PASS ARRAY AND START AND LAST POSTION TO REVERSE FUNCTION
o	SECOND PART WILL START FROM ARRAYS LENGTH -ROTATION TO ARRAYS LENGTH-1
  	SIMILARLY PASS ARRAY AND START AND LAST POSTION TO REVERSE FUNCTION

•	REVERSE FUNCTION
o	FOLLOWS TWO POINTER APPROACH
    	FIRST POINTER  POINTS TO STARTING POS AND SECOND POINTER TO END POS
    	PERFORM SWAP LOGIC
    	THEN INCREEMENT FIRST POINTER AND DECREMENT SECOND POINTER
NOTE:-BEFORE PASSING TO THE POS TO REVERSE FUNCTION ATTACH A CHECK FOR NEGATIVE ROTATION AND
POSITVE ROTATION
	 

         */
        Scanner input = new Scanner(System.in);

        // INPUT VALUES IN AN ARRAY
        System.out.print("ENTER SIZE OF AN ARRAY:- ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // ROTATION
        System.out.print("ENTER ROTATION:- ");
        int k = input.nextInt();

        // ROTATE ARRAY FUNCTION
        rotate_array(array, k);

        // DISPLAY
        for (int value : array) {
            System.out.print(value + " ");
        }

    }
}
