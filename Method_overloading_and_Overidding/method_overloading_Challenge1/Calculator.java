package  method_overloading_Challenge1;

public class Calculator {

    /*
     * In a class Calculator, create multiple add() methods that overload each other and can sum two integers, three integers, or two doubles. 
     * Demonstrate how each can be called with different numbers of parameters.
     */
    public int add(int a ,int b){
        return  a+b;

    }

    public int add(int a,int b,int c){
        return a+b+c;

    }

    public double add(double a ,double b){
        return a+b;

    }



    public static void main(String[] args) {

        Calculator calc=new Calculator();
        /*
         * HERE calc.add(1,2)) WILL GET EXECUTED EVEN IF ADD(INT A ,INT B) METHOD  I REMOVED
         * BECUASE IT WILL CALL add(double a ,double b) METHOD AS INT WILL GET CONVERT INTO DOUBLE AND WILL RETURN DOUBLE
         * BUT SIMILARLY IF WE REMOVE double add(double a ,double b) THEN calc.add(1.0,58.0) WILL GIVE ERROR AS DOUBLE CANT BE CONVERTED INTO INTEGER RESULTING INTO LOSSING DATA
         */
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1,2,3));
        System.out.println(calc.add(1.0,58.0));

        
    }
    
}
