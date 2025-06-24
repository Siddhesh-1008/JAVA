import java.util.Scanner;
public class find_occurence_of_element
{
    public static void main(String[] args) 
    {
    System.out.print("ENTER THE SIZE OF ARRAY:- ");
    Scanner input=new Scanner(System.in);

    //GET THE UTILTY CLASS 
    int[] array=ArrayUtility.inputArray();
    System.out.print("PLEASE FIND THE OCCURENCE OF ELEMENT GIVEN BY USER:- ");
    
    //GET NUMBER THAT HAS TO BE FOUND IN AN ARRAY
    int element=input.nextInt();

    //CALL FUNCITON(METHOD)
    int occurence=occurence(array,element);
    System.out.println("UR ELEMENT HAS FOUND "+occurence+" TIMES IN AN ARRAY");
    }

    public static int occurence(int[] array,int element)
    {
        int i=0;
        //AS U FIND THE NUMBER INCREMENT THE COUNT
        int count=0;
        while(i<array.length)
        {
            if(array[i]==element)
            {
                count=count+1;
            }
            i++;
        }
        return count;
    }
    
    
}
