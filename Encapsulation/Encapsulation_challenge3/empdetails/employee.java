package Encapsulation_challenge3.empdetails;
//CREATE A EMPLOYEE CLASS THAT IS DEFAULT 
//MEANS NOW THIS CLASS BE ACCESSED ONLY IN Encapsulation_challenge3.empdetails FOLDER
class employee 
{
    //CREATE A EMPLOYEE CLASS THAT IS DEFAULT
        //MEANS NOW THIS CLASS BE ACCESSED ONLY IN Encapsulation_challenge3.empdetails FOLDER
    //CREATE NAME AGE SALARY PRIVATE
    //CREATE DEFAULT CONSTRUCTOR AND THAT CONSTRUCTOR CAN BE ONLY ACCESS TO ALL CLASSES WHICH ARE IN THAT PACKAGE
    //MAKE PUBLIC GETTER AND SETTER METHODS FOR NAME AGE SALARY
    //MAKE DEFAULT(MEANS PACKAGE PRIVATE)displayEmployeeDetails METHOD
    //CREATE ANOTHER CLASS IN SAME PACKAGE TO ACCESS EMPLOYEE CLASS

    //PRIVATE ACCESS MODIFIER FOR ALL INSTANCE PROPERTIES
    private String name;
    private int age;
    private int salary;

    //MAKE A DEFAULT OCNSTRUCTOR SO THAT IT CAN BE ACCESSIBLE IN ONLY Encapsulation_challenge3.empdetails FOLDER
    employee(String name,int age,int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    //CREATE A GETTER AND SETTER METHOD FOR GETTING AND SETTING VALUES TO THEIR INSTANCE ATTRIBUTES
    public String get_name()
    {
        return this.name;
    }
    public void set_name(String name)
    {
        System.out.println("CONGO U SET NAME");
         this.name=name;
    }

    public int get_age()
    {
        return this.age;
    }
    public void set_age(int age)
    {
        this.age=age;
    }

    public int get_salary()
    {
        return this.salary;
    }
    public void set_salary(int salary)
    {
        this.salary=salary;
    }

    //MAKE THESE METHOD String employee_details() DEFAULT SO THAT WE CANN AACESS IT ONLY IN THIS PACAKGE String employee_details()
    String employee_details(){
        return "UR EMPLOYEE NAME IS:- "+name +"\nAND ITS AGE IS:- "+age +"\nAND ITS SALARY IS:- "+salary;
    }
    
}
