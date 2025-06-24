import upcasting_And_Downcasting.Child;
import upcasting_And_Downcasting.Parent;

public class Test{
    public static void main(String[] args) {
        //parent
        Parent prnt=new Parent();
        //child
        Child chld=new Child();
        
        //Upcasting
        //SIMILARLY IN UPCASTING WE CAN STORE CHILD OBJECT INTO PARENT REFERENCE BUT NOT VICE VERSA Child chld=new Parent()"GIVES COMPILE TIME ERROR"
        //HERE BASICALLY IT WILL CHECK WHETHER CHILD IS AN INSTANCE OF CHILD OBJECT IF YES THEN STORE IT IN REFERNCE OF PARENT 
        Parent parent1=new Child();
        System.out.println(parent1.parent_name);
        //MEANS NOW HERE PARENT REFERENCE CAN ACCESS OVERRIDE MTHODS THAT HAS BEEN OVERRIDED IN ITS CHILD CLASS
        //NOT APPLICABEL FOR VARAIBLES
        parent1.says();
        //Parent parent2=new Child2();     
System.out.println();
        //DOWNCASTING
        //U CAN DO DOWNCASTING ONLY BY EXCPLICITLY
        //MEANS HERE PARENT1 BASICALLY CONTAINS NEW CHILD() OBJECT BUT IT HAS A TYPE PARENT CLASS
        //THEREFORE WE DO TYPE CAST WHICH RESULTS INTO THAT WE ARE DOWNCASTING PARENT REFERNCE TO CHILD REEFERENCE
        Child c2=(Child) parent1;
        System.out.println(c2.child);
        c2.says();
System.out.println();
        //SIMILARLY FOR OBJECT CLASS HERE DEFAULT OBJECT CLASS IS PARENT FOR ALL CLASSES(PARENT,CHILD)
        //SUCH AS public class Parent extends Object 
        Object ref=new Child();
        System.out.println(ref.toString());

        
       

    } 
}