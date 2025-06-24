
import java.util.Scanner;

public class Lec19 {
    // BULB SWITCHER(BENJAMIN BULB)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no_of_bulbs = input.nextInt();

        for (int i = 1; i <= Math.sqrt(no_of_bulbs); i++) {
            System.out.println(i * i + " BULB IS ON ");
        }
    }
}
