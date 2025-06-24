public class max_and_min {
    public static void main(String[] args) {
        //FIRST OF ALL CHECK WHETHER THE ARRAY IS EMPTY OR NOT
        //THEN CONSIDER FIRST ELEMENT IN AN ARRAY AS MAX
        //THEN COMPARE THAT ELEMENT WITH OTHER ELEMENTS IN AN ARRAY
        //IF OTHER ELEMENTS ARE GREATER THAN THAT ELEMENT 
        //THEN UPDATE THE MAZ
        System.out.println("MAX MIN CALCULATOR:- ");
        System.out.print("ENTER THE SIZE OF AN ARRAY:-");
        int[] array=ArrayUtility.inputArray();
        int minimum=min(array);
        System.out.println("SMALLEST ELEMENT IN AN ARRAY:- "+minimum);
        int max=max(array);
        System.out.println("LARGEST ELEMENT IN AN ARRAY:-" + max);

    }

    /**
     * FINDING MINIMUM ELEMENT IN AN ARRAY LOGIC
     * @Test
    public void test() {
        
    } */
    public  static int min(int[] array)
    {
        //FIRST OF ALL CONSIDER LARGEST VALUE AS minimum
        int minimum=Integer.MAX_VALUE;
        int i=0;
        //THEN COMPARE WHETHER THE minimum(Integer.MAX_VALUE)IS GREATER THAN OTHER ELEMENTS IN AN ARRAY
        //IF SO SET minimum AS CURRENT ELEMENT(array[i]) AS array[i] WILL BE THE SMALLEST ELEMENT
        while(i<array.length)
        {
            if(minimum>array[i])
            {
                minimum=array[i];
            }
            i++;
        }

        return minimum;
    }

    /**
     * FINDING MAXIMUM ELEMENT IN AN ARRAY LOGIC
     * @param array
     * @return
     */
    public  static int max(int[] array)
    {
        // IF ARRAY DOESNOT HAVE ANY ELEMENT IN IT
        // THEN RETURN THE SAMLLEST VALUE Integer.MIN_VALUE
        if(array.length==0)
        {
            return Integer.MIN_VALUE;
        }
        //int max=array[0]=>CONSIDER INDEX 0 ELEMENT(STARTING ELEMENT) AS LARGEST ELEMENT IN AN ARRAY 
        //max<array[i]=>THEN CHECK WHETHER THE STARTING ELEMENT IS SMALLER THAN OTHER ELEMENTS IN AN ARRAY
        //max=array[i]=>IF SO THEN UPDATE THE MAX TO CURRENT ELEMENT WHICH IS LARGER THAN 0TH ELEMENT
        int max=array[0];
        int i=0;
        while(i<array.length)
        {
            if(max<array[i])
            {
                max=array[i];
            }
            i++;
        }
        return max;
    }
    
}
