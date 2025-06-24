package CHALLENGES;
public class Concate_Strings
 {
    /*
     * Write a method concatenate Strings that takes variable arguments of String type and concatenates them into a single string.
     */

     public static String concatenate(String...names)
     {
        /*
         * FIRST OF ALL CREATE CONCATENATE METHOD
         * BASICALLY THIS METHOD TAKES VAR ARGS "names" AS ARGUMENTS  
         * THAT IS  VAR_aRGS=>"String...names"
         * THEN MAKE USE OF STRING BUILDER TO CONCATENATE N STRINGS
         * AS IT DOESNOT CREATE NEW OBJECT IF WE CONCATENATE USING "+" OPERATOR IT WILL CREATE N OBJETS IN STRING POOL
         *  
         */
        StringBuilder sb1=new StringBuilder();
        for(String i:names)
        {
            sb1.append(i).append(" ");
        }
        return sb1.toString();
     }
    
     public static void main(String[] args) 
    {

        System.out.println(Concate_Strings.concatenate("RAHUL"));
        System.out.println(Concate_Strings.concatenate("RAHUL","IS","A","GOOD","BOY"));
        System.out.println(Concate_Strings.concatenate("ER.","RAHUL","IS","A","GOOD","BOY"));
    }
        
}
