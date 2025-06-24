
package LISTSINTERFACE;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists{
    public static void main(String[] args) 
    {
        /*
         * FIRST OF ALL IMPORT ARRAYLIST LIBRARY
         * THEN CREATE ARRAY LIST FOR CLASSES STRING INTEGERS FLOAT BOOLEAN 
         * MEANS IN ARRAY LIST WE CAN STORE ONLY OBJECTS 
         * ACCORDINGLY INTERFACE_NAME<DEFINE_CLASS_OR_DATATYPE_MEANS_WHICH_DATATYPE_VALUES_NEED_TO_BE_STORED> array_list_name=new ArrayList<DEFINE_CLASS_OR_DATATYPE_MEANS_WHICH_DATATYPE_VALUES_NEED_TO_BE_sTORED>();
         * THEN ADD VALUE TO THE LIST USING array_list_name.add(value)
         * THEN GET THE ELEMENT array_list_name.get(index_no) HERE INDEX STARTS FROM 0 TO N
         * TO ADD THE ELEMENT IN BETWEEN  array_list_name.add(index_number_where_u_Want_To_add,element)
         * TO REPLACE A PARTICULAR ELEMENT FROM SPECIFIC INDEX IN ARRAYLIST  array_list_name.set(index_number,replaced_element)
         * TO DELETE THE ELEMENT FROM ARRAYLIST  array_list_name.remove(index_number_of_the_elemtn_that_u _want_to_delete)
         * TO GET THE SIZE(LENGTH) OF ARRAYLIST  array_list_name.size();
         * TO SORT THE ELEMENTS OF ARRAYLIST IN ASCENDING ORDER WE CAN MAKE USE OF COLLECTNOS CLASS Collections.sort(array_list_name)
         * TO SEE WHETHER THE ELEMENT IS PRESENT IN ARRAYLIST OR NOT array_list_name.contain(Object o) AND IT RETURNS TRUE OR FALSE BOLLEAN VALUE BASED ON PRESENCE
         * TO GET THE INDEXUMBER OF ANY FIRST OCCURENCE ELEMENT IN ARRAY LIST array_list_name.indexOf(Object o) BASICALLY IT RETURNS -1 IF ELEMENT IS NOT PRESENT IN ARRAYLIST
         */
        //basically we have arraylist class that implements list interface
        //DEFINE DATAYPE OF ARRAYLIST AND CREATE IT 
        //BASICALLY HERE ELEMENTS(1,2,3,45,50) ARE OBJECTS OF CLASS INTEGER FLOAT,STRING,INTEGER
        //GENERIC TYPES <Integer> BASICALLY EXISTS ON COMPILE TIME AND GET REMOVED DURING RUNTIME 
         List<Integer> list = new ArrayList<>();
        
        //ADDING ELEMENT IN ARRAYLIST
        list.add(1);
        list.add(2);
        list.add(3);

        //ACCESS ELEMENTS FROM ARRAYLIST THROUGH INDEX NUMBER
        System.out.println(list.get(0));

        //ITERATING EACH ELEMENT IN THE ARRAY LIST
        for(int i:list)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //ADDING ELEMENT AT PARTICULAR INDEX NUMBER
        list.add(1,45);
        System.out.println(list);

        //REMOVE THE ELEMENT FROM A PARTICULAR INDEX FROM ARRAYLIST
        //PERMANENTLY REMVOES THE ELEMEMNT
        list.remove(3);
        System.out.println(list);

        //BASICALLY USE TO REPLACE THE ELEMENT FROM PARTICUALR INDEX
        list.set(2,50);
        System.out.println(list);

        //TO SEE WHETHER THE ELEMENT PRESENT IN ARRAYLIST OR NOT
        if(list.contains(45)){
            System.out.println("YES IT IS PRESENT ON INDEXNUMBER:- "+ list.indexOf(45));
        }
        else{
            System.out.println("IT IS NOT PRESENT");
        }


        ArrayList<String> list2=new ArrayList<String>();
        list2.add("RAO");
        list2.add("RADHA");
        list2.add("GOA");
        System.out.println(list2);
        list2.clear();
        System.out.println(list2);

        int x=6;
        int y=x++;
        //now x++ will result into x=7 and y=6 as then it will increment 1 to x
        System.out.println(x + "" + y);
        






        
    }
}