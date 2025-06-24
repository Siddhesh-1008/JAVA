
public class Lec2 {

    // FUNCTION TERMINATION
    public static void swap(int i, int j, int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }

    public static void main(String[] args) {
        /*
SUMMARY
•	STACK 
  o	STORES STARTING ADRESS 
•	HEAP 
  o	STORES ACTUAL VALUES

•	DEEP COPY
  o	STORES NEW ARRAY ADDRESS
  o	CHANGES NOT AFFECTED

•	SHALLOW COPY
  o	STORES EXISTING ADDRESS OF ARRAY
  o	CHANGES AFFECTED

         */
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        // SHALLOW COPY IF ADDDRESS OF arr is 4k THEN SAME IS PASS TO THE FUNCTION
        swap(0, 2, arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
