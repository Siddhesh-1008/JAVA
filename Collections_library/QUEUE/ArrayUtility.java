package QUEUE;

import java.util.Collection;


public class ArrayUtility {
    
    /*
     * WE ARE WRITING "Collection coll" BECAUSE IT WILL CONSIDER ALL COLLECTION INTERFACE 
     *HERE COLLECTION INTERFACE IS PARENT INTERFACE OF OTHER INTERFACE THUS WE CAN WRITE AS Collection coll= new PriorityQueue<Integer>();
     *BEACUSE WE CAN STORE CHILD INTERFACE IN PARENT INTERFACE CALLED AS UPCASTING
     *HERE COLLECTION CAN STORE N PRIMITIVE DATA TYPES(WRAPPER CLASS) OBJECTS THAT CAN BE INTEGER,STRING...
     */
        public static void show(Collection coll)
        {
            System.out.print("COLLECTION IS:- ");
            //HERE OBJECT REFERS TO INTEGER,STRING..CLASS DATATYPE 
            for(Object i:coll){
                System.out.print(i + " ");
            }
            System.out.println();

        }
    
}
