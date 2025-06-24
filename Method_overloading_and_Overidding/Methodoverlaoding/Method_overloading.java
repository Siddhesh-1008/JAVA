package Methodoverlaoding;

public class Method_overloading
{
    /*
     * IN METHOD OVERLOADING WE HAVE METHOD WITH SAME NAME BUT THEIR BEHAVIOUR CHANGES BASED ON THE PAREMATER THAT HAD BEEN PASSED
     * HERE COMPILER DIFFERENTIATE SAME METHODS BASED ON THIER RETURN TYPE,PARAMETER PASSED
     */
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public String add(String a,String b){
        return a+b;
    }




    public static void main(String[] args)
     {
        Method_overloading mo=new Method_overloading();
        System.out.println( mo.add(5,10));
        System.out.println(mo.add("FIRST","SECOND"));
        System.out.println(mo.add(2, 1, 3));
        
        
    }
}