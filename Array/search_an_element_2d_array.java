
import java.util.Scanner;

public class search_an_element_2d_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("WELCOME TO 2DSEARCH ARRAY");
        //GET THE TWO D ARRAY
        int[][] TwoDimArray=ArrayUtility.input2darray();

        System.out.println("UR ARRAY LOOK LIKE THIS:- ");
        //FOR DIPALYING THE 2D ARRAY
        ArrayUtility.display2dArray(TwoDimArray);

        //SEARCH THE ELEMENT IN 2D ARRAY
        System.out.print("ENTER THE ELEMENT U WANT TO SEARCH IN 2D ARRAY:-");
        int searchelem=input.nextInt();

        boolean isFound=isSearch(TwoDimArray,searchelem);
        if(isFound){
            System.out.println("UR ELEMENT HAS BEEN FOUND");
        }
        else{
            System.out.println("UR ELEMENT HAS NOT BEEN BEEN FOUND");
        }
        
    }

    public static boolean isSearch(int[][] TwoDimArray,int searchelem){
        int i=0;
        while(i<TwoDimArray.length){
            int j=0;
            //TwoDimArray[i].length BASICALLY REFERS TO ZEROTH ROW AND J REFERS TO ZEROTH COLUMN
            //MEANS while(j<TwoDimArray[i].length) THIS LOOP WILL GET 0TH ROW 0TH COLUMN THEN 0TH ROW 1TH COLUMN THEN 0TH ROW 2ND COLUMN AND MOVE ON..
            //ARR=[{1,2,3},{4,5,6},{7,8,9}] 
            while(j<TwoDimArray[i].length)
            {
                if(TwoDimArray[i][j]==searchelem)
                {
                    return  true;
                }
                j++;
            }
            i++;

        }
        return false;
    }


}
