package CHALLENGES.challenge1;
public class CHALLENGE1 
{
    /*
     * Create an enum called Day that represents the days of the week.
     *  Write a program that prints out all the days of the week from this enum.
     */

     enum Day 
     {
         Monday,Tuesday,Wedensdy,Thursday,Friday,Saturday,Sunday;
     }

     public static void main(String[] args) 
     {
          /*
           * FIRST OF ALL CREATE A ENNUM CLASS AND DECLARED THE CONSTANTS(DAYS OF THE WEEK)
           * WE HAD CREATED ENUM CLASS INSIDE THE CLASS CHALLENGE1
           * THEN IN public static void main(String[] args) ITERATE OVER  ALL THE CONSTANTS(DAYS)
           *  USING FOREACH LOOP THAT ITERATE OVER THE ARRAY TAHT HAS BEEN GIVEN BY:- ENUM_NAME.values()
           * 
           */
          System.out.println("PRINT ALL DAYS OF THE WEEK :- ");
          for(Day day:Day.values()){
               System.out.print(day + " ");
          }

          

     }
    
}
