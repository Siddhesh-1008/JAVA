
import java.util.*;

public class Lec6 {

    public static void main(String[] args) {
        /*
PATTERN IS ABOUT ADDING EACH ELEMENT OF TWO ARRAY ALONG WITH CARRY
    •	FIRST THING GET TWO ARRAYS VALUES
    •	THEN DEFINE THE SIZE OF SUM ARRAY
    o	THE SIZE OF SUM ARRAY DEPENDS UPON MOSTLY ON BOTH ARRAY SIZE
      	ONE WITH BIGGER ARRAY SIZE IS TAKEN INTO CONSIDERATION FOR SUM ARRAY SIZE
    •	THEN INTIALIZE  i,j,k
      o	BASICALLY i,j POINT TO THE LAST POSITION ELEMENT OF BOTH ARRAYS
      o	AND k REFERS TO THE LAST POSITION ELEMENT OF SUM ARRAY
    •	NOW RUN THE WHILE LOOP UNTIL SUM ARRAY DOESN’T GET EMPTY
    •	NOW FIRST INTIALIZE CARRY TO ZERO
      o	IF U SEE PROPERLY CARRY IS ADDED WITH ELEMENT ON  POS i AND ELEMENT ON POS j
        	NOW START ADDING  CARRY TO Ith ELEMENT AND STORE IT IN VARIABLE 
        	THEN ADD THAT VARIABLE TO jth ELEMENT AND PROCESS GO ON
    •	BUT NOW HOW BASICALLY ADDITON HAPPENS AND HOW CARRY IS CALCULATED
      o	IF 8+6=14 THEN CARRY IS CALCULATED BY 14/10=1 AND RESULT IS CALCULATED BY 14%10=4
    •	THEN STORE THE RESULT IN SUM ARRAY
    •	THEN JUST DECREMENT i,j,k TO MOVE FROM LAST_POS TO FIRST_POS
    •	BUT ONCE U REACHED FROM END TO START THERE CAN BE CHANCES THAT CARRY CONTAIN VALUES THEN APPLY CHECK AND PRINT SPACE AND VALUE PRESENT IN SUM ARRAY

         */
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER SIZE:- ");
        int size1 = input.nextInt();
        System.out.print("ENTER SIZE:- ");
        int size2 = input.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = input.nextInt();
        }

        int carry = 0;
        int[] sum_array = new int[size1 > size2 ? size1 : size2];

        // POINTS TO LAST POS OF RESPECTIVE ARRAY
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum_array.length - 1;

        // RUN UNTIL U DONT REACH LAST POS OF SUM ARRAY
        while (k >= 0) {
            int d = carry;

            // ADD CARRY TO LAST ELEMENT OF ARRAY1
            if (i >= 0) {
                d = d + arr1[i];
            }

            // ADD UPPER RESULT TO LAST ELEMENT OF ARRAY2
            if (j >= 0) {
                d = d + arr2[j];
            }

            // HOW TO FIND CARRY AND FIND RESULT
            carry = d / 10;
            int last_dig = d % 10;

            // STORING RESULT IN SUM ARRAY
            sum_array[k] = last_dig;

            // FOR MOVING FROM LAST POS TO FIRST POS
            i--;
            j--;
            k--;

        }
        if (carry != 0) {
            System.out.print(carry);
        }

        for (int value : sum_array) {
            System.out.print(value);
        }

    }
}
