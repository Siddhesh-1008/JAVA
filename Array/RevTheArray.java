public class RevTheArray {
    public static void main(String[] args) {
        //LOGIC 1
        // Reverse the array without creating a new array
        //FIRST OF ALL CREATE A NEW ARRAY
        //THEN PASS THE ARRAY TO THE FUNCTION rev(arr)
        //THEN  USE SWAPPING  LOGIC TO REPALCE ARRAY[0] WITH ARR[LAST_ELEMENT]
        //THEN CREATE A LOOP SUCH THAT i<j WHERE I=0 AND J IS ARRAYS LENGTH-1
        //ONCE REACHED AT THE POINT WHERE i GETS GREATER THAN j THEN WE NEED TO RETURN THE ARRAY
        int[] arr = {1, 2, 3, 4, 5, 6};
        // Call the rev method to reverse the array
        int[] newArray=rev(arr);
        //DISPLAYING THE ARRAY
        int i=0;
        System.out.println("UR REVERSED ARRAY:-");
        while(i<newArray.length){
            System.out.print(newArray[i]+" ");
            i++;
        }
        System.out.println();


        //LOGIC 2
        //Reverse the array without creating a new array
        //FIRST OF ALL CREATE A NEW ARRAY
        //THEN PASS THE ARRAY TO THE FUNCTION rev(arr)
        //HERE I MUST BE TRAVEELING TTLL THE MID OF ARRAY IF IT WENT FORWARD THESE THEN IT RETURNT THE SAME USER INPUT ARRAY
        //THEN  USE SWAPPING  LOGIC TO REPALCE ARRAY[0] WITH ARR[LAST_ELEMENT]
        //HERE ARR[STARITNG POSITON]=ARR[(LENGTH+OF_ARRAY-1)-i]
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] narr=reverse(arr1);
        int z=0;
        System.out.println("UR REVERSED ARRAY:-");
        while(z<narr.length){
            System.out.print(narr[z]+" ");
            z++;
        }
        System.out.println();

    }

    public static int[] rev(int[] arr) {
        int temp;
        int i = 0;
        int j = arr.length - 1; // Initialize j to the last index

        // Swap the elements until i and j meet in the middle
        //STOP ONCE i GETS BIGGER THAN j
        while (i < j) {
            // Swap elements at index i and j
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move towards the center
            i++;
            j--;
        }
        return arr;
    }


    public static int[] reverse(int[] arr1){
        int i =0;

        while(i<((arr1.length)/2)){
            int temp=arr1[i];
            arr1[i]=arr1[(arr1.length-1)-i];
            arr1[(arr1.length-1)-i]=temp;
            i++;
        }
        return arr1;
        

    }

}
