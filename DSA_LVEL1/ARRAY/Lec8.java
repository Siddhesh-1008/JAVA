
import java.util.*;

public class Lec8 {

    // SWAPPING LOGIC
    public static void swap_Array(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        /*
    🔍 Understanding the Logic
    •	We use two pointers:
          o	i starts from the first index (0)
          o	j starts from the last index (n - 1)
    •	We swap the elements at positions i and j.
    •	After each swap:
          o	Increment i
          o	Decrement j
    •	Repeat this until the pointers meet or cross, i.e., while i < j

         */
        Scanner input = new Scanner(System.in);

        // INPUT VALUES IN AN ARRAY
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // SHALLOW COPY 
        swap_Array(array);

        // DISPLAY ARRAY
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

}
