
import java.util.*;

public class Lec3 {
// SPAN OF AN ARRAY
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // DECLARING AND ALLOCATING SPACES
        int[] arr = new int[5];

        //ALLOCATING VALUES
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // UPDATE MAX AND MIN
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // FIND SPAN OF ARRAY
        int span = max - min;

        System.out.println("SPAN OF ARRAY:- " + span);

    }

}
