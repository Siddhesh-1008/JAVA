package METHOD_REFERENCE;
import java.util.Arrays;
import java.util.List;

public class Method_Reference 
{


    public static void main(String[] args) 
    {
        /*
         * METHOD REFERENCE CAN BE USED ONLY IF METHOD TAKES 1 PARAMETER AND DOESNOT RETURN ANYTHING
         * list.stream().forEach(System.out::println) HERE "System.out::println" IT TAKES ONE PARAMETER NUM AND JUS PRINT IT
         * 
         */
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().forEach(System.out::println);

        Integer sum=list.stream().reduce(0,(num1,num2)->num1+num2);

       

    }
    
}
