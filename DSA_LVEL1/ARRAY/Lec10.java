import java.util.*;
public class Lec10{


  // INVERSE ARRAY
  public static int[] inverse_Array(int[] array,int size){
   int[] inverse_array=new int[size];

  //  INVERSE ARRAY
   for(int i=0;i<array.length;i++)
   {
      // v=3
      int v=array[i];
      // inv[3]=0
      inverse_array[v]=i;
   }
   return inverse_array;

  }


  public static void main(String[] args){
    /*
    SUMMARY
    •	SIMPLE TRICK 
        o	ORIGINAL ARRAY MAE JO VALUE AHE USKO INVERSE ARRAY MAE INDEX BANAO 
        o	AND ORIGINAL ARRAY MAE JO INDEX AHE USKO INVERSE ARRAY MAE VALUE BANAO
     */

    Scanner input=new Scanner(System.in);

    System.out.print("ENTER SIZE OF AN ARRAY");
    int size=input.nextInt();
    int[] array=new int[size];
    for(int i=0;i<array.length;i++)
    {
      array[i]=input.nextInt();
    }

    // RESULT ARRAY
    int[]result=inverse_Array(array,size);

    // DISPLAYING ARRAY
    for(int value:result){
      System.out.print(value + " ");
    }

  }
}