package COLELCTIONS_CLASS;
import QUEUE.ArrayUtility;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collectionsclass {
    public static void main(String[] args) 
    {
        List<Integer> numbers=new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(99);
        numbers.add(4);
        numbers.add(0);
        ArrayUtility.show(numbers);

        //If you want to use binarySearch(), you must ensure that the list is sorted in ascending order before calling binarySearch()
        ////binnary search TO FINS THE INDEX OF THE ELEMENT
        int indexno=Collections.binarySearch(numbers, 99);
        System.out.println("UR INDEX NUMBER IS :-" + indexno);

        //TO SORT THE ELEMENTS IN THE LIST
        Collections.sort(numbers);
        ArrayUtility.show(numbers);

        //TO FIND MIN MAX ELEMENT IN LIST
        int max=Collections.max(numbers);
        int min=Collections.min(numbers);
        System.out.println(min + "," + max);

        //REVERSING THE LIST
        Collections.reverse(numbers);
        ArrayUtility.show(numbers);

        //MAKE A LIST THAT IS UNMODIFABLE
        //MEANS U CANT ADD ELEMETNS IN LIST ONCE IT GETS UNMODIFIABLE IF U TRY TO IT WILL GIVE EXCEPTION
        List<Integer> unmodifiableList=Collections.unmodifiableList(numbers);
        System.out.println(unmodifiableList.add(90));

       

        


        
    }
}
