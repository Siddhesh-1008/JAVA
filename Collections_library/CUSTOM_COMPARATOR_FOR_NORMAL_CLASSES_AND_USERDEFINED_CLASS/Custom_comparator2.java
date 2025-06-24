package  CUSTOM_COMPARATOR_FOR_NORMAL_CLASSES_AND_USERDEFINED_CLASS;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
 * SORT STUDENTS BASED ON THEIR INCREASING MARKS 
 */
public class Custom_comparator2 {
    public static  class Student
    {
        public String name;
        public int marks;

        public Student(String name,int marks)
        {
            this.name=name;
            this.marks=marks;
        }

        @Override
        public String toString() 
        {
            return "name: " + this.name +" marks: " +this.marks ;
        }



    }
     public static void main(String[] args)
    {
        Comparator<Student> custom_comp=new Comparator<Student>() 
        {
            public int compare(Student stud1,Student stud2)
            {
                /*
                 * BASICALLY SWAP IF UR STUNDENT 1 MARKS ARE GERATER THAN STUDENT 2 MARKS RETURN 1 MEANS SWAP
                 * RETURN -1 MEANS DONOT DO ANYTHING
                 */
                if(stud1.marks>stud2.marks)
                {
                    return 1;
                }
                 else {
                    return -1;  
                }
                
            }
        };

        //SORT IS NOT APPLIED FOR QUEUE
        //COLLECTIONS WORK ON ONLY WRAPPER CLASSES SUCH AS USERDEIFNED CLASS,INTEGR,STRING
        List<Student> names=new LinkedList<>();
        //DD STUDENT OBJECTS TO LIST 
        names.add(new Student("SIDDHESH", 21));
        names.add(new Student("SIDDHESH", 12));
        names.add(new Student("SIDDHESH", 18));
        names.add(new Student("SIDDHESH", 20));

        //SORT NOT WORKS ON USERDEFINED CLASS SUCH AS STUDENT WE NEED CUSTOM COMPARATOR TO COMPARE IT 
        Collections.sort(names,custom_comp);

        for(Object i:names)
        {
            System.out.print(i +"\n");
        }

        
        //System.out.println(names);
        
    }
}
