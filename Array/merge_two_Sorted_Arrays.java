public class merge_two_Sorted_Arrays {
   public static void main(String[] args) {
     //FIRS GET TWO ARRAYS
    //THEN CREATE A FUNCTION AND PASSED TWO ARRAY
    //CREATE A NEW ARRAY HAVING SIZE EQL TO ADDITION OF SIZES OF TWO ARRAY
    //TRAVERSE BOTH THE ARRAYS FROM i to arr1.length AND J to arr2.length
    //IF arr1 STARTING POISITION (ELEMENT)IS SMALLLER THAN arr2 STARTING POISITION (ELEMENT)
    //THEN ADD arr1 STARTING POISITION (ELEMENT) TO NEW ARRAY STARITNG(K) POSITION
    //SIMILARLY IF arr2 STARTING POISITION (ELEMENT) IS SMALLER 
    //THEN ADD arr2 STARTING POISITION (ELEMENT) TO NEW ARRAY STARITNG(K) POSITION
    //ALSO SEE WHETHER FIRST ARRAY DOESNOT GET COMPLETED AND SECOND ARRAY IS NOT COMPLETED AND VICE VERSA THEN ADD LOGIC TO IF LOOP TO NOT GET ERROR
    System.out.print("PLEASE ENTER THE SIZE OF ARRAY:-");
    int[] arr1=ArrayUtility.inputArray();
    System.out.print("PLEASE ENTER THE SIZE OF ARRAY:-");
    int[] arr2=ArrayUtility.inputArray();

    int[] mergedarray=mergedArray(arr1,arr2);
    ArrayUtility.display(mergedarray);

   }

   /**
    * MERGED TWO ARRAYS
    *DEFINE SIZE OF NEW ARRAY
    *BOTH THE GIVEN ARRAYS ARE IN SORTED ORDER
    * @param arr1
    * @param arr2
    * @return
    */
   public static int[] mergedArray(int[] arr1,int[] arr2)
   {

        int botharrayssize=arr1.length+arr2.length;
        //GET NEW ARRAY HAVING SIZE(LENGTH) ADDITON OF TWO ARRAYS SIZE
        int[] newArray=new int[botharrayssize];

        //SET ALL ARRAY STARTING POSITION AS 0
        int i=0;
        int j=0;
        int k=0;

        //LOOP TO SEE i AND j REACHES TILL END OF BOTH THE ARRAY
        while(i<arr1.length || j<arr2.length)
        {
            
            //ARR1 KO COPY KARO NEW ARRAY KE KTH POISITON MAE
            //IF SECOND ARRAY  GETS COMPLETED BUT NOT FIRST ARRAY THEN IT WILL GOTO ARR1 KO COPY KARO NEW ARRAY KE KTH POISITON MAE
            //AS j==arr2.length || arr1[i]<arr2[j]          || IS LOGICAL OPERATOR ONE IS TRUE(SECOND ARRAY GETS COMPLETED) THEN IT WILL NOT CHECK FURTHER AND WILL COPY ARR1 TO NEW ARRAY K PISIOTION
            //IF SECOND ARRAY NOT GET COMPLETED(FALSE) BUT FIRST ARRAY GETS COMPLETED THEN ARR2 KO COPY KARO NEW ARRAY KE KTH POISITON MAE
            //AS j==arr2.length=FALSE 
            // (i<arr1.length && arr1[i]<arr2[j]) THAT IS (TRUE && FALSE  ) WHICH IS FALSE
            //(j==arr2.length || (i<arr1.length && arr1[i]<arr2[j]) )  THAT IS (FALSE || FALSE ) THUS MOVE TO ELSE PART

            if( j==arr2.length || (i<arr1.length && arr1[i]<arr2[j]) ) 
            {
                newArray[k]=arr1[i];
                i++;
                k++;
                
            }
            //ARR2 KO COPY KARO NEW ARRAY KE KTH POISITON MAE
            else
            {
                newArray[k]=arr2[j];
                k++;
                j++;
                
            }

        }
        return newArray; 
    
   }

}
