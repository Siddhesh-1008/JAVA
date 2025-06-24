package CompileTimePoly;

public class Employee{
    //METHOD OVERLOADING 
    //method name must be same but parameters can be diff or type of parameters can be different

    public void add(int n1,int n2){
        int val=n1+n2;
        System.out.println(val);
    }

    public void add(int n1,int n2,int n3){
        int val=n1+n2+n3;
        System.out.println(val);
    }

}
