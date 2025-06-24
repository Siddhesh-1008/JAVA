import CompileTimePoly.Employee;
import Runtime_poly.Employeee;
import Runtime_poly.Person;
import Runtime_poly.Ram;

public class Test2 {
    public static void main(String[] args) {
        //HERE IN METHOD OVERLOADING SAME METHOD PERFORMS DIFFERENT FUNCTIONALITY
        //here method functionality changes as per the parameters u are passing
        //BASICALLY AT COMPILE TIME ONLY WE KNOW WHAT PARAMETERS SHOULD BE PASSED TO RUN THE PARTICUALR FUNCTIONALITY
        //IF WE PASSED TWO PARAMTERES THEN DIFFERENT ADD FUNCTION WILL RUN SIMILAR IF THREE PARAMETERS ARE PASSED THEN DIFFERENT ADD FUNCTION WILL RUN
        Employee emp=new Employee();
        emp.add(1,2);
        emp.add(1,2,3);

        //METHOD OVERIDDING
        // Person p1=new Person();
        // p1.show();

        //BASICALLY WHEN UR FUNCTIONALITY BEHAVIOUR GET CHANGE BASED ON THE OBJECT
        //HERE show() FUNCTION WILL DISPLAY PERSON FUNCTION SHOW IF UR OBJECT IS new Person
        //HERE show() FUNCTION WILL DISPLAY EMPLOYEEE FUNCTION SHOW IF UR OBJECT IS new Employeee
        //AND IT ONLY WORKS WHEN UR BOTH CLASSES HAS SAME METHODS
        Person p1=new Employeee();
        p1.show();

System.out.println();
    Person p2=new Employeee();
        Ram r1=new Ram();
        r1.showdetails(p2);


        

        
    }
}
