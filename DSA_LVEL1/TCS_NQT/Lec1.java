
import java.util.*;

public class Lec1 {

    public static String numberToWords(int num) {
        String[] belowTen = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String[] belowTwenty = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] belowHundred = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"};

        // FOR UNIT DIRECT LOOK
        if (num == 0) {
            return "Zero";
        }
        // FOR SINGLE DIGIT DIRECT LOOK
        if (num < 10) {
            return belowTen[num];
        }
        // FOR SPEICIAL CASE BETWEEN 11 TO 19 DIRECT LOOK
        if (num < 20) {
            return belowTwenty[num - 10];
        }
        //FOR HUNDRED LOOK FOR BELOWHUNDRED AND BELOWTEN(BY 10)
        if (num < 100) {
            return belowHundred[num / 10] + (num % 10 != 0 ? " " + belowTen[num % 10] : "");
        }
        // FOR THOUSANDS LOOK FOR BELOWTEN AND HUNDRED AND RECURSIVE CALL(BY 100)
        if (num < 1000) {
            return belowTen[num / 100] + " Hundred" + ((num % 100 != 0) ? " " + numberToWords(num % 100) : "");
        }
        // FOR LAKHS RECURSIVE CALL AND THOUSAND  AND RECURSIVEE CALL(BY 1000)
        if (num < 1000000) {
            return numberToWords(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + numberToWords(num % 1000) : "");
        }
        // FOR MILLIONS RECURSIVE CALL AND MILLION  AND RECURSIVEE CALL(BY 10^6)
        if (num < 1000000000) {
            return numberToWords(num / 1000000) + " Million" + (num % 1000000 != 0 ? " " + numberToWords(num % 1000000) : "");

        }
        // FOR BILLIONS RECURSIVE CALL AND BILLION  AND RECURSIVEE CALL(BY 10^9) 
        return numberToWords(num / 1000000000) + " Billion" + (num % 1000000000 != 0 ? " " + numberToWords(num % 1000000000) : "");
    }

    public static void main(String[] args) {
        /*
      QUICK TRICK
        •	IF NUM IS ZERO THEN PRINT ZERO
          o	DIRECT ZERO
        •	IF NUM IS BELOW 10 MEANS BETWEEN 0 TO 9 THEN SEE UNDER BELOWTEN ARRAY
          o	DIRECT SEARCH
        •	IF NUM IS BELOW TWENTY BETWEEN 10 TO 19 THEN SEE UNDER BELOWTWENTY ARRAY
          o	DIRECT SEARCH
        •	IF NUM IS BELOW HUNDRED THEN SEE UNDER BELOW TWENTY AND BELOW TEN ARRRAY
          o	DIVIDE AND MODULUS BY 10 
        •	IF NUM IS BELOW THOUSAND THEN SEE UNDER BELOW TEN  AND DO RECURIVE CALLS FOR LAST TWO DIGITS
          o	DIVIDE AND MODULUS BY 100
        •	IF NUMBER IS BELOW LAKH(10^6)THEN DO RECURSIVE CALLS AND THOUSAND DO RECURIVE CALLS FOR LAST THREE DIGITS
          o	DIVIDE AND MODULUS BY 1000
        •	IF NUMBER IS BELOW MILLION(10^9)THEN DO RECURSIVE CALLS AND MILLIONS DO RECURIVE CALLS FOR LAST 6 DIGITS
          o	DIVIDE AND MODULUS BY 1 000 000
        •	ELSE THEN DO RECURSIVE CALLS AND BILLIONS DO RECURIVE CALLS FOR LAST 9 DIGITS
          o	DIVIDE AND MODULUS BY 1 000 000 000
         */
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String result = numberToWords(num);
        System.out.println(result);
    }

}
