package superkeyword;
public class Car extends Vehicle{

    String name="Rahul";
    public void start1(){
        //ACCESING PARENT CLASS START METHOD USING SUPER KEYWORD
        super.start();
        System.out.println("HI I AM FROM CHILD CLASS");
         //ACCESING PARENT CLASSS VARIABLENAME  USING SUPER KEYWORD
        System.out.println("ACCESSING NAME FROM PARENT CLASS:- " + super.name);
    }
}
