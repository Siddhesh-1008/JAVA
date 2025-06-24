
import java.util.*;

public class Lec1 {

    // DISPLAY CODE
    public static void display(int n, int r, int res) {
        System.out.println(n + "C" + r + "=" + res);

    }

    // FUNCTION EXECUTION
    public static int fact(int fact) {
        int rv = 1;
        for (int i = 1; i <= fact; i++) {
            rv = rv * i;
        }
        return rv;
    }

    public static void main(String[] args) {
        // FACTORIAL
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();

        // INPUTS TO THE FUNCTIONS
        int nfact = fact(n);
        int rfact = fact(r);
        int nminusrfact = fact(n - r);

        // FORMULA
        int nCr = nfact / (rfact * (nminusrfact));
        display(n, r, nCr);

    }
}
