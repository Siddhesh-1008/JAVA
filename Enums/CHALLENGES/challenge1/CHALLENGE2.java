package CHALLENGES.challenge1;
public class CHALLENGE2
{
    /*
     * Enhance the Day enum by adding an attribute that indicates whether it is a weekday or weekend.
     * Add a method in the enum that returns whether it's a weekday or weekend, 
     * And write a program to print out each day along with its type.
     */

     enum Day 
     {
         Monday("Weekday"),Tuesday("Weekday"),
         Wednesday("Weekday"),Thursday("Weekday"),
         Friday("Weekday"),Saturday("Weekend"),
         Sunday("Weekend");

         //INSTANCE ATTRIBUTE
         String daytype;

         //CONSTRUCTOR
         Day(String daytype)
         {
          this.daytype=daytype;
         }

         //METHOD
         //THIS REPRESNT TOS Monday,Tuesday objects..
         //WHENEVER WE CALL day.gettype() HERE day IS BASICALLY Monday,Tuesday objects..
         //MEANS Monday.gettype() THIS return this.daytype; REPRESNETS return Monday.daytype;
         public String gettype()
         {
          return this.daytype;
         }
     }

     public static void main(String[] args) 
     {
          /*
           * FIRST OF ALL CREATE A ENNUM CLASS AND DECLARED THE CONSTANTS(DAYS OF THE WEEK)
           * WE HAD CREATED ENUM CLASS INSIDE THE CLASS CHALLENGE1
           * THEN IN public static void main(String[] args) ITERATE OVER  ALL THE CONSTANTS(DAYS)
           * USING FOREACH LOOP THAT ITERATE OVER THE ARRAY TAHT HAS BEEN GIVEN BY:- ENUM_NAME.values()
           * THEN GET THE DAYTYPE OF DAY
           * IF WE DO Day.day.gettype() IN FOEACH LOOP "for(Day day:Day.values())"" IT IS WRONG 
           * AS day IS AN INSTANCE FOR ENUM CLASS DAY SO WE CAN ACCESS IT BY day.gettype() OBJECT.gettype() AS gettype() IS AN INSTANCE METHOD
           * BUT WE CANNOT DIRECTLY USE Day.gettype() AS gettype() IS NOT AN STATIC METHOD 
           * BUT WE CAN WRITE Day.Monday... BECAUSE MONDAY IS STATIC OBJECT"static final Day Monday=new Mo Monday();" SO WE CAN ACCESS IT USING CLASSNAME.OBJECT
           */
          System.out.println("PRINT ALL DAYS OF THE WEEK AND THEIR DAY TYPE WHETHER IT IS A WEEK DAY OR WEEKEND:- ");
          
          //ITERATE OVER A LOOP
          //HERE Day day=Monday; BASICALLY Monday IS AN STATIC  OBJECT AND TO ACESS THAT OBJECT WE NEED TO CREATE INSTNATIATE THAT IS CLASSTYPE name
          //Day.values() method returns an array of objects, where each object represents an instance of the Day enum
          for(Day day:Day.values())
          {
               System.out.println("DAY IS:- "+ day + " AND IT IS A " + day.gettype());
          }

          

     }
    
}