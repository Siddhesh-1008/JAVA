public class print_even_skip_odd_num {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ADDING POSITIVE NUMBERS IN AN ARRAY:- ");
        int[] array=ArrayUtility.inputArray();
        find_Even(array);
    }
    
    /**
     * SKIPS ODD NUMBERS IN AN ARRAY
     * @param array
     * @return
     */
    public static void find_Even(int[] array)
    {
        for(int num:array)
        {
            //I U DIVIDE UR ODD NUMBER WITH 2 THEN IT WILL ALWAYS GIVE REMAINDER 1
            if(num%2==1)
            {
                continue;
            }
            System.out.println("EVEN NUMBER FROM ARRAY :- " + num);
        }
    }
    
}
