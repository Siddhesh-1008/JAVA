
import java.util.Scanner;

public class del_elem_from_Array {
    public static void main(String[] args)
    {
        //FLOW
        //FIRST THING INSERT ELEEMENTS IN AN ARRAY
        //ALLOW USER TO DETERMINE WHICH ELEMENT U NEED TO DELETE
        //THEN FIRST OF ALL SEE HOW MANY TIME THAT DELETE ELEMENT OCCURS IN AN ARRAY
        //THEN CREATE NEW ARRAY HAVING SIZE SUBTRACTING THE NUMBER OF OCCURENCE OF DELETED ELEMENT
        //THEN TRAVERSE ALL THE ELMENTS IN THE ORGINAL ARRAY 
        //AND THEN STORE ONLY THAT ELEMENTS IN NEW ARRAY WHICH ARE NOT EQUAL TO ELEMENT THAT USER WANT TO DELETE

        System.out.print("ENTER THE SIZE OF THE ARRAY:- ");
        Scanner input=new Scanner(System.in);
        int[] array=ArrayUtility.inputArray();

        System.out.print("ENTER THE ELEMENT THAT U WANT TO DELETE:- ");
        int deletedElement=input.nextInt();

        int[] newarray=delElement(array,deletedElement);
        System.out.println("NEW ARRAY WITH DELETED ELEMENT");

        //FOR DISPLAYING NEW ARRAY
        ArrayUtility.new_array_of_del_element(newarray);
    }

    /**
     * DELETE ELEMENT FROM EXISITING ARRAY
     * AND MAKE NEW ARRAY THAT DIDNT CONSIST THE DELETED ELEMENT
     * @param array
     * @param deletedElement
     * @return
     */
    public static int[] delElement(int[] array,int deletedElement)
    {
        int occurence_of_element=occurence(array,deletedElement);
        
        //IF ELEMENT THAT USER NEED TO DELETE IS NOT PRESENTED IN THE ARRAY THEN RETURN OROGINAL ARRAY
        if(occurence_of_element==0){
            return array;
        }

        //FOR DETERMING NEW SIZE OF ARRAY
        int newSizeOfArray=array.length-occurence_of_element;
        //CREATE NEW ARRAY 
        int[] newArray=new int[newSizeOfArray];

        //HERE i WILL INCREMENT EACH TIME AND j WILL INCREMENT ONLY WHEN array[i]!=deletedElement 
        //FIRST TRAVERSE WHOLE ARRAY AND COPY THAT ELEMENTS IN NEW ARRAY ONLY WHEN array[i]!=deletedElement
        int i=0;
        int j=0;
        //COPYING ELEMENTS IN NEW ARRAY
        while(i<array.length)
        {
            if(array[i]!=deletedElement)
            {
                newArray[j]=array[i];
                j++;
            }
            i++;
        }
        return  newArray;

    }

    /**
     * OCCURENCE LOGIC
     * @param array
     * @param deletedElement
     * @return
     */
    public static int occurence(int[] array,int deletedElement){
        int count=0;
        int i=0;
        while(i<array.length){
            if(array[i]==deletedElement)
            {
                count++;
            }
            i++;
        }
        return count;

    }
}
