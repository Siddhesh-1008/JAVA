package CHALLENGES;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Student_Priority_Queue 
{
    /*
     * Create a PriorityQueue of a custom class Student with attributes name and grade.
     *  Use a comparator to order by grade.
     */
    /*
     * CREATE A STATIC INNER CLASS STUDENT 
     * CREATE PRIVATE FINAL ATRRIBUTES IN IT THAT IS NAME AND GRADE
     * MAKE CONSTRUCTOR OF IT TO SET VALUE
     * CREATE GETTER FOR BOTH THE VALUE TO GET  THE VALUES
     * CREATE A PRIOIRTY QUEUE FOR STUDENT CLASS AS WE CREATE PRIOIRITY QUES FOR INTEGER.STRING CLASS
     * BASICALLY PRIORITY QUEUE CONSTRUCTOR REQUIRES CUSTOM COMAPRATOR
     * MEANS new PriorityQueue<>(new Comparator<Student>(){public int compare(Student s1,Student s2){return values}})
     * BASICALLY WHENEVER WE USED PRIORITY QUEUE WE NEED TO USE CUSTOM COMPARATOR BECAUSE IT COMAPRES(SORT) <Intger or String..> VALUES IN ITS NATURAL ORDER
     * BECAUSE WHENEVER U INSERT ELEMENTS THEY ARE NOT INSERTED IN ORDER THAT U HAVE INSERTED BUT REMOVED IN INCREASING ORDER
     * compareto BASICALLY USED FOR SORTING 
     * 
     * ASCENDING ORDER
     * If RESULT IS POSITIVE MEANS SMALLER ELEMENT WILL COME FIRST AND THEN BIGGER ELEMENT
     * Example: If comparing "B" and "A", "B" is greater than "A", so "B" will come after "A".
     * DESCENDING ORDER
     * IF RESULT IS NEGATIVE MEANS BIGGER ELEMENT WILL COME FIRST AND THEN SMALLER
     * Example: If comparing "A" and "B", "A" is less than "B", so "A" will come before "B".
     * BASICALLY THIS CUSTOM COMPARATOR REQUIRE TO COMPARE THE NSTUDENT OBJECT GRADES 
     * THEN ADD STUDENT CLASS OBJECTS TO QUEUE
     * MEANS QUEUE WILL HAVE QUEUE[STUDENT s1,STUDENT s2,STUDENT s3]
     * GRADES ORDER:-B C A D A
     */

     public static class Student
     {
        private final String name;
        private final String grade;

        public Student(String name,String grade)
        {
            this.name=name;
            this.grade=grade;
        }


        public String getname(){
            return this.name;
        }

        public String getgrade()
        {
            return this.grade;
        }

        @Override
        public String toString() {
            return "Name:"+this.name + " Grade:" + this.grade;
        }

        

     }

    public static void main(String[] args)  
    {
        /*
         * FOR INTEGERS AND STRING PRIORITY QUEUE SORT IT IN INCREASING ORDER OF ALPAHBETIC AND INTEGER(PRIORITY QUEUS ALWAYS SORT IN ASCENDING ORDER)
         * BUT FOR USER DEFINED CLASS WE NEED TO DEFINE CUSTOM COMPARATOR FOR SORTING LOGIC
         */

        Comparator<Student> comp=new Comparator<Student>()
        {
            public int compare(Student s1,Student s2)
            {
                /*
                 * A IS SMALLER THAN B THEN RETRURN -1 NOCHANGE KEEP IT AS IS
                 * B IS SMALLER THAN A THEN RETURN 1 MEANS SWAP MEANS A WILL COME FIRST THEN B
                 */
                //SORT IN ASCENDING ORDER
                //return s1.getgrade().compareTo(s2.getgrade());
                //SORT IN DESCENDING ORDER
                //return s2.getgrade().compareTo(s1.getgrade());

                //DESCENDING ORDER
                //s1.getgrade().charAt(0)<s2.getgrade().charAt(0) THEN QUEUE WOULD BE HEAD-F D C B A A-TAIL
                //ASCENDING ORDER
                //s1.getgrade().charAt(0)>s2.getgrade().charAt(0)  THEN QUEUE  HEAD-A A B C D F-TAIL
                //s1.getgrade().charAt(0) STRING KA OTH INDEX DEKHO 
                //PRIORITY QUEUE IS SMART IT WILL NOT SHOW ORDER IN WHICH U HAVE SORTED ELEMENTS IN(CUSTOM COMPARATOR) 
                //INSTEAD OF IT WILL SHOW ORDER IN WHICH U HAVE SORTED ELEMENTS IN(CUSTOM COMPARATOR) DURING REMOVING THE ELEMENT FROM THE QUEUE
                //IF RETURN IS 0(MEANS STUDENT 1 ALSO GRADE A AND STUDENT 2 ALSO GET GRADE A) THEN CHECK WHO HAVE INSERTED FIRST 
                if(s1.getgrade().charAt(0)>s2.getgrade().charAt(0))
                {
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        //CREATING QUEUE INTERFACE
        Queue<Student> description=new PriorityQueue<>(comp);

        //BASICALLY WE ARE ADDING STUDENT OBJECT TO QUEUE Student s1=new Student("SIDDHESH", "C")
        //HERE WE ARE INSERTING VALUES WILL BE NOT IN SAME ORDER THAT U HAD INSERTED 
        description.offer(new Student("SIDDHESH", "C"));
        description.offer(new Student("SIDDHESH", "A"));
        description.offer(new Student("SIDDHESH", "D"));
        description.offer(new Student("SIDDHESH", "B"));
        description.offer(new Student("ARYAAN", "A"));
        description.offer(new Student("SIDDHESH", "F"));
    
        //BUT REMOVING WILL BE IN ASCENDING ORDER AS PER USER DEFINE IT IN CUSTOM COMPARATOR
        //FOR THIS CODE IT IS ASECNDING BUT IF U CHANGE THE LOGIC OF CUSTOM COMPARATOR TO DESCENDING IT WILL SHOW IN DESCENDING ORDER
        System.out.println(description.remove());
        System.out.println(description.remove());
        System.out.println(description.remove());
        System.out.println(description.remove());
        System.out.println(description.remove());
        System.out.println(description.remove());
        
    }

    }
