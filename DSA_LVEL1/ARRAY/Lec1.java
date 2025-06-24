
public class Lec1 {

    public static void main(String[] args) {

        // DECLARATION OF ARRAY
        int[] arr;

        // ALLOCATE SPACES
        arr = new int[5];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;

        // PRINT ARRAY
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
