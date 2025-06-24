package SETINTERFACE;

import QUEUE.ArrayUtility;
import java.util.HashSet;
import  java.util.Set;

public class SetInterface {
    public static void main(String[] args) 
    {
        Set<String> name=new HashSet<>();

        //ADD ELEMENTS IN SET
        //DUPLICATE ELEMENTS ARE NOT ADDED IN SET 
        //HERE IF WE TRY TO ADD DUPLICATE ELEMENTS IN SET HERE NAME.ADD() WILL GIVE BOOLEAN FALSE
        name.add("SIDDHESH");
        name.add("RAHUL");
        name.add("SIDDHARTH");
        ArrayUtility.show(name);

        //REMOVING SPECIFIC ELEMENT FROM SET
        name.remove("RAHUL");
        ArrayUtility.show(name);

        //SEE WHETHER ELEMENT IS PRESENT IN SET OR NOT
        //IF NOT PRESNET THEN IT WILL GIVE BOOLEAN VALUE AS FALSE
        System.out.println(name.contains("SIDDHESH"));

        //TO SEE SET IS EMPTY OR NOT
        System.out.println(name.isEmpty());

    }
    
}
