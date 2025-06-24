import java.util.Scanner;

public class Arry_Search{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        Scanner input=new Scanner(System.in);
        System.out.print("USER PLEASE ENTER THE NUMBER THAT U NEED TO FIND:-");
        int num=input.nextInt();
        boolean isFound=isFound(arr,num);
        if(isFound)
        {
            System.out.println("NUMBER FOUND");
        }
        else{
            System.out.println("NUMBER NOT FOUND");
        }

    }

    /**
     * FINDING ELEMENT IN AN ARRAY
     * @param arr
     * @param num
     * @return
     */
    public static boolean isFound(int[] arr,int num)
    {
        int index=0;
        //TRAVERSE WHOLE ARRAY AND COMPARE WHEHTER NUMBER IS ORESNET IN ARRAY OR NOT
        while(index<arr.length)
        {
            if(arr[index]==num)
            {
                return  true;
            }
            index++;
        }
        //THIS WILL return false ONLY WHEN while loop gets completed and number hasnt found in array
        return false;
    }
}
