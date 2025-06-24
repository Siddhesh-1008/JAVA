public class Student_to_String{
    String name;
    int age;

    Student_to_String(String name,int age)
    {
        this.name=name;
        this.age=age;

    }

    //INSTANCE METHODS
    //RETURN VALUE IN STRING 
    /**
     * TO STRING METHOD TO DISPLAY OBJECT (STUDENT) DETAILS
     * @Test
    public void test() {
        
    } */
    @Override
    public String toString() {
        StringBuilder sb1=new StringBuilder("{name:");
        sb1.append(name);
        sb1.append(", age:").append(age);
        sb1.append("}");
        return sb1.toString();
    }

    
    
    public static void main(String[] args) 
    {
        /*
         CREATE STUDENT CLASS
         THEN CREATE TWO INSTANCE PROPERTIES name and age
         THEN CREATE CONSTRUCTOR TO ASSIGN VALUES TO OBJECT name AND age
         THEN CREATE toString METHOD TO DISPLAY STUDENT DETAILS
         THEN CREATE Stringbuilder object TO AVOID MULTIPLE CONCATENATIONS
         WITH THE HELP OF Stringbuilder object.append("")WE CAN APPEND STRING TO ORGNL_STRING

         */
        Student_to_String s1=new Student_to_String("Siddhesh", 10);
        System.out.println(s1.toString());

    }
}
