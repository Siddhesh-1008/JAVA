package ChallengesPart2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    //DECLARE NAME AND SALARY VARIABLES
    private String name;
    private int salary;

    //SET CONSTRUCTOR
    public Employee(String name,int salary)
    {
        this.name=name;
        this.salary=salary;
    };

    //THIS METHOD WILL RETURN SLARAY OF PARTICULAR EMPLOYEE CLASS OBJECT
    public int getSalary()
    {
        return this.salary;
    }

    //OVERRIDE STRING METHOD
    //BECAUSE WHEN WE WRITE employeelist.add(new Employee("SIDD", 1000 ));BASICALLY THESE MEANS EMPLOYEE OBJECT THAT CAN BE e1,e2,...
    //SO LIST WILL CONTAIN EMPLOYEE CLASS VALUES IN PROPER STRING FORAMT
    @Override
    public String toString() {
        return "Employee" + "{name=" + this.name + ", salary=" +this.salary + "}" + " ";
    }


    
}
public class Challenge2
{
     public static void main(String[] args) 
     {
    /*
     * .Create a list of employees with name and salary fields.
     * Write a comparator that sorts the employees by salary.
     * Then, use this comparator to sort your list using the sort stream operation.
     */

     //CREATE A LIST OF EMPLOYEE CLASS
     List<Employee> employeelist=new LinkedList<Employee>();

     //THEN ADD EMPLOYEE OBJECT IN LIST
     //MEANS LIST WILL CONTAIN OBJECTS OF EMPLOYEE CLASS
     //new Employee("SIDD", 1000 ) PASS NAME AND SALRY FILEDS IN CONSTRUCTOR
     employeelist.add(new Employee("SIDD", 1000 ));
     employeelist.add(new Employee("SIDD", 10 ));
     employeelist.add(new Employee("SIDD", 1 ));
     employeelist.add(new Employee("SIDD", 100 ));

     //ORIGINAL LIST
     System.out.println("WITHOUT SORTED SALARY:- " + employeelist);
     
     //CONVERT LIST TO STREAM
     //APPLY SORTED METHOD ON IT 
        //BUT HERE SORTED METHOD CONTAINS COMPARATOR INTERFACE 
        //AND THAT INTERFACE CONTAINS ONE PUBLIC ABSTRACT METHOD
        //THAT IS compareto WHICH TAKE TWO STRINGS,INTEGERS...
        //SO WE CAN TREAT IS AS LAMBDA EXPRESSION (VAL1,VAL2)->TERNIARY OPERATOR
        //Comparator in Java always works with two objects of the same type.
        //AS SO WE TAKE TWO EMPLOYEE OBJECTS AND THEN CARRY OUT COMPARISON BETWEEN IT
        //AND THEN CONVERTED THAT STREAM TO LIST
     List<Employee> newlist=employeelist.stream()
     .sorted((Employee e1,Employee e2)->e1.getSalary()>e2.getSalary()?1:-1)
     .collect(Collectors.toList());

     System.out.println("WITH SORTED SALARY:- " + newlist);

     }
}
