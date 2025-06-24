
import java.util.*;

public class Lec4 {

    public static int find(int[] arr, int data) {

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                index = i;
                break;
            }

        }
        return index;
    }

    public static void main(String[] args) {
/*
SUMMARY:-
🔁 Process Breakdown:
  Declare and create an array using user-provided size.
  Fill each index of the array with user input.
  Take the value (data) to search for.
  Linear search logic:
      Start from the beginning of the array.
      Compare each element with data.
          If a match is found:
          Save the index.
          Break out of the loop (since only the first occurrence is needed).
          If not found by the end of the loop, return -1.
  Print the index where the data is found, or -1 if not found.
*/
        Scanner input = new Scanner(System.in);

        // DECLARE ARRAY AND ALLOCATE SPACE
        int size = input.nextInt();
        int[] arr = new int[size];

        // ALLOCATE VALUES TO EACH LOCATION
        for (int i = 0; i < arr.length; i++) {
            System.out.print("VALUE AT INDEX:- " + i);
            arr[i] = input.nextInt();
        }

        // DATA THAT NEED TO BE FOUND
        int data = input.nextInt();

        int result = find(arr, data);

        System.out.println("FOUND AT INDEX:- " + result);

    }
}
