package Optional;
import java.util.*;

public class Optional_Method
{
    /*
     * HERE WE DEFINE DATAYPE OF METHOD AS Optional<String>
     * ANS WE BASICALLY RETURNING OPTIONAL OBJECT
     */
    public static  Optional<String> getname()
    {
        String name=null;
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) 
    {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
        
        //STORE THESE LIST IN OPATIONAL CONTAINER T
        //Optional<DETERMINES_DATATYPE_OF_VALUES_THAT_ARE STORING IN CONTAINER>
        Optional<List<Integer>> vals=Optional.ofNullable(nums);

        /*
         * vals.isPresnet() RETURN TRUE OR FALSE BASED ON THE VALUES INSIDE THE CONTAINER
         * IF NO VALUES ARE PRESNET THEN ELSE PART
         * IF VALUES ARE PRESENT THEN WITH vals.get() WE CAN GET ALL VALUES
         */
        if(vals.isPresent())
        {
            System.out.println(vals.get());
        }
        else{
            System.out.println("NONE ");
        }

        //Optional_Method.getname() GETS OPTIONAL OBJECT
        Optional<String> newname=Optional_Method.getname();
        //isPresent() TO CHECK STRING IS PRESENT OR NOT
        if(newname.isPresent())
        {
            System.out.println(newname.get());
        }
        else
        {
            System.out.println("NULL VALUE IS PRESENT");
        }




    }
}
