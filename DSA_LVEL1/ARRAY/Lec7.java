
import java.util.*;

public class Lec7 {

    public static void main(String[] args) {
        /*
🧾 Step-by-Step Logic
🔹 1. Input Two Arrays
      Create two arrays to store digits of both numbers.
      Assign values to the arrays from most significant to least significant digit.
🔹 2. Prepare the Result Array
      Result array size should be equal to the maximum size of the two arrays (since subtraction never increases the number of digits).
      Initialize a result array of that size.
🔹 3. Initialize Pointers
        Use three variables:
        i → points to last index of the first array
        j → points to last index of the second array
        k → points to last index of the result array

🔁 4. Loop: While k >= 0
    At each step:

    🔸 A. Handle shorter array
      If one array is shorter than the other, assume leading zeros.

      Example: 0056 – 123 → pad 56 as 0056

    🔸 B. Perform Subtraction with Borrow:
      If: second[j] + borrow >= first[i]
        Then: d = second[j] + borrow - first[i]
        Set borrow = 0
      Else:
        Add 10: d = second[j] + borrow + 10 - first[i]
        Set borrow = -1

    🔸 C. Store Result Digit:
        Place the value d in result[k]

    🔸 D. Decrement Pointers:
        i--, j--, k--

  🔍 5. Remove Leading Zeros from Result
        Initialize an index = 0

        While result[index] is 0, increment index

        Break when a non-zero digit is found
Example:
Result array = [0, 0, 0, 9, 1] → should be printed as 91

📤 6. Print the Final Answer
      Print from result[index] till the end of the array

         */
        Scanner input = new Scanner(System.in);

        // ARRAY 1 
        System.out.print("ENTER SIZE:- ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        // ARRAY 2
        System.out.print("ENTER SIZE:- ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }

        // INTIALIZE i,j,k TO END POSITION OF ARRAYS
        // DEFINE SIZE OF RESULT ARRAY AND SIZE MAINLY DEPENDS UPON THE ARRAY SIZE WHICH IS LARGE
        int[] res = new int[size2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = res.length - 1;

        // NOW GET BORROW
        int borrow = 0;

        while (k >= 0) {

            int d = 0;

            // ADD ZEROS TO THE LEFT SIDE IF A2 SIZE IS GREATER TAHN A1 SIZE
            int arrvalue = i >= 0 ? arr1[i] : 0;

            if (arr2[j] + borrow > arrvalue) {
                d = arr2[j] + borrow - arrvalue;
                borrow = 0;
            } else {
                d = arr2[j] + borrow + 10 - arrvalue;
                borrow = -1;
            }

            res[k] = d;

            i--;
            j--;
            k--;

        }

        //CHECK FOR LEFT ZEROS
        int index = 0;
        while (index < res.length) {
            if (res[index] == 0) {
                index++;
            } else {
                break;
            }
        }

        System.out.print("RESULT IS:- ");
        while (index < res.length) {
            System.out.print(res[index] + " ");
            index++;
        }
    }
}
