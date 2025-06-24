package  CUSTOM_COMPARATOR_FOR_NORMAL_CLASSES_AND_USERDEFINED_CLASS;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Custom_comparator {
    public static void main(String[] args)
    {
        Comparator<String> custom_comp=new Comparator<String>() 
        {
            public int compare(String str1,String str2)
            {
                //HERE WE HAD JUST DONE SWAPPING IF STR1 IS A AND STR2 IS AAA
                //WE USE RETURN 1 FOR SWAPPING
                //AS A IS SMALER THAN AA THEN JUST SWAP IT MEANS AAA THEN A
                //IF STR1 IS AAA AND STR2 IS A
                //WE USE RETURN -1 FOR NOT SWAPPING
                //THEN DONT SWAP 
                if(str1.length()<str2.length()){
                    return 1;
                }
                else
                {
                    return -1;
                }
                
            }
        };

        //SORT IS NOT APPLIED FOR QUEUE
        //COLLECTIONS WORK ON ONLY WRAPPER CLASSES SUCH AS USERDEIFNED CLASS,INTEGR,STRING
        List<String> names=new LinkedList<>();
        names.add("A");
        names.add("AA");
        names.add("AAA");
        Collections.sort(names,custom_comp);
        System.out.println(names);
        
    }
}
