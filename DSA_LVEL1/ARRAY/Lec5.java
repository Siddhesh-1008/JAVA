
import java.util.Scanner;

public class Lec5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        // ASSIGN VALUES ON EACH SPACES
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // MAX HEIGHT FINDER
        int max_height = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_height) {
                max_height = arr[i];
            }
        }

        // DIFFERNT HEIGHTS VS CURRENT BUILDING FLOORS
        for (int floor = max_height; floor >= 1; floor--) {
            for (int j = 0; j < arr.length; j++) {

                // current building height greater than diff heights of floor then print star
                if (arr[j] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
