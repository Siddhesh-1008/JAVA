package Encapsulation_challenge3.empdetails;

public class employee_tester 
{
    public static void main(String[] args) {
        //WE DONT NEED TO EMPLOYEE PACKAGE AS WE HAD KEPT IT DEFAULT 
        employee emp=new employee("SID",20,50000);
        emp.set_name("RAHUKE");
        System.out.println(emp.employee_details());
    }
}
