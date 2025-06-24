public class Course {
    //INSTANCE VAR courseName,enrolledStudents
    //Static varibale maxCapacity
    //INSTANCE METHODS enrollStudents,unenrollStudents GIVE STUDENT NAME TO IT AS PARAMETERS
    //STATIC METHOD setMaxCapacity PASS MAX CAPACITY FOR A PARITCULAR COURSE

    static int maxCapacity=100;

    String courseName;
    int enrollements;
    String[] students;

    //Constructor for course compulsary say coursename
    Course(String courseName) 
    {
        this.courseName=courseName;
        this.enrollements=0;
        this.students=new String[maxCapacity];

    }

    //SET ARRAY FOR ENROLLSTUDENTS WITH SIZE THAT IS MAX CAPACITY DEFINED FOR COURSE
    //Course c1=new Course() WHENEVER Course.setMaxCapacity(100) WILL CALLED IT WILL SET MAX CAPACITY USING Course.maxCapacity=maxCapacity;
    //AND THAT RESPECTIVE OBJECT c1 MAX CAPACITY CAN BE USED AS A ZIE FOR ARRAY
    //String[] students=new String[maxCapacity];

    // STATIC BLOCK
    // static
    // {
    //     maxCapacity=100;
    // }

    //STATIC METHOD
    //BASICALLY THIS int maxCapacity WE ARE GETTING WHEN WE PASSED PARAMETER BY RESPECTIVE OBJECT OBJECT.setMaxCapacity(VALUE)
    /**
     * SETTING MAXCAPACTY SIZE OF STUDENTS ARRAY
     * @Test
    public void test() {
        
    } */
    public static void setMaxCapacity(int maxCapacity)
    {
        //TO SET VALUE TO STATIC VARIABLES WE NEED TO MAKE USE OF CLASS NAME
        //ClassName.maxCapacity=maxCapacity
        Course.maxCapacity=maxCapacity;
    }

    //STUDENT NAME WILL BE GIVEN WHEN c1.enrollStudents("SIDDHESH") WILL BE CALLED
    //AND IT WILL ADD students TO students ARRAY
    /**
     * FOR ADDING NEW STUDENTS IN ARRAY THAT USER HAS PASSED IN c1.enrollStudents("SIDDHESH")
     * AND THEN INCREMENT THE ENROLLEMENTS BY 1 SUCH AS NEW ELEMENT WILL BE ADDED TO NEXT POSIOITON
     * @param studentName
     */
    public void enrollStudents(String studentName)
    {
        System.out.println("ENROLLED");
        students[enrollements]=studentName;
        this.enrollements++;
    }

    /**
     * UNENROLL STUDENT FROM students ARRAY AND THEN DISPALY THE ARRAY WITH REMOVED STUDENT
     * @param studentName
     */
    public void unenrollStudents(String studentName){
        int occurence=occurence(studentName,students);
        //System.out.println(occurence);
        System.out.println("UNENROLLED");
        String[] deletionarray=deletion(students,occurence,studentName);

        //FOR PRINTING NEW ARRAY WITH DELETED ELEMENT
        int i=0;
        while(i<deletionarray.length)
        {
            if (deletionarray[i] != null) {
                System.out.print(deletionarray[i] +" ");
            }
            i++;
        }
        System.out.println();

        this.enrollements--;
    }

    public int occurence(String studentName,String[] students){
        int i=0;
        int counts=0;
        while(i<students.length)
        {
            if(students[i]==studentName)
            {
                counts++;
            }
            i++;
        }
        return counts;
    }

    public String[] deletion(String[] students,int occurence,String studentName){
            int size=students.length-occurence;
            String[] newstudentsarray=new String[size];
            int i=0;
            int j=0;
            //System.out.println(studentName);
            //COPYING ELEMENTS IN NEW ARRAY
            while(i<newstudentsarray.length)
            {
                if(students[i]!=studentName)
                {
                    newstudentsarray[j]=students[i];
                    j++;
                }
                i++;
            }
            return newstudentsarray;

    }
   
    public static void main(String[] args) {
        Course c1=new Course("PYHTON");
        c1.enrollStudents("SIDDHESH");
        c1.enrollStudents("RAJU");
        c1.enrollStudents("Gopal");
        c1.enrollStudents("Gopal");
        c1.unenrollStudents("RAJU");
        //c1.unenrollStudents("SIDDHESH");


    }
}
