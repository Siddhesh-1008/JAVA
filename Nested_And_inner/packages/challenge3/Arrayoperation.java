package packages.challenge3;

import java.util.Arrays;

public class Arrayoperation
{
    int[] array;
    public Arrayoperation(int[] array)
    {
        this.array=array;
    }

    public class  Stastics
    {
        public void mean()
        {
            double sum=0;
            for(double i:array)
            {
                sum=sum+i;
            }
            double mean=sum/array.length;
            System.out.println("MEAN OF UR ARRAY IS:- "+ mean);
            

        }

        public void median()
        {
            //BASICALLY SORT THE ARRAYS IN ASCENDING ORDER
            Arrays.sort(array);
            double median;
            int length=array.length;
            //IF ARRAY LENGTH IS EVEN THEN CONSIDER MEANS 5, 8, 12, 20 MEDIAN=8+12/2.0
            //IF ARRAY LENGTH IS ODD THEN CONSIDER 5, 8, 12 MEDIAN =8
            if(length%2==0){
                median =(array[length/2-1]+array[length/2])/2.0;
            }
            else {
                // Odd number of elements: middle element
                median = array[length / 2];
            }
           System.out.println(Arrays.toString(array));
           System.out.println(median);

        }


    }

        public static void main(String[] args) {
        int[] array=new int[]{
            5,12,8,20
        };
        Arrayoperation obj1=new Arrayoperation(array);
        Arrayoperation.Stastics obj2=obj1.new Stastics();
        obj2.mean();
        obj2.median();

    }
}