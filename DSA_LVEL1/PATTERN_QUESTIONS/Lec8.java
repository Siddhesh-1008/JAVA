
import java.util.Scanner;

public class Lec8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total_rows = input.nextInt();

        for (int i = 1; i <= total_rows; i++) {
            for (int j = 1; j <= total_rows; j++) {
                if (i + j == total_rows + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
