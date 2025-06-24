
import java.util.Scanner;

public class read_inputs {
    public static void main(String[] args) {
        //read inputs from the user in a loop and break the loop if a specific keyword like exist is entered
        //TAKE INPUT FROM THE USER
        //MAKE AN INFINITE LOOP 
        //THEN COMPARE UR STRING WITH WORD THAT ALLOWS CODE TO BREAK THE LOOP
        //BUT TO COMPARE TWO STRINGS CONTENT WE NEED TO USE string1.equals(string2)
        //AS String is a Class: In Java, String is not a primitive data type.
        //It's a class in the Java standard library, which means that when you declare a variable of type String, you are creating an object.str1 ans str2 ARE THE OBJECTS
        //IF WE DO str1==str2 WE ARE COMPARING OBJECT AND NOT CONTENT
        Scanner input=new Scanner(System.in);
        String str1="exist";
        while(true){
            System.out.print("PELASE ENTER THE TEXT:- ");
            String str2=input.next();
            if(str2.equals(str1)){
                break;
            }
        }
        System.out.println("U ARE SUCCESFUULY OUT OF THE LOOP USING BREAK ");
        System.out.println();
        while(true){
            System.out.print("PELASE ENTER THE TEXT:- ");
            String str2=input.next();
            //str2.equalsIgnoreCase(str1) BASICALLY IT DONT CONSIDER THE CASES THAT IS UPPER,LOWER
            //IF WE ENETER EXIST THEN ALSO IT WILL GET OUT OF THE LOOP
            if(str2.equalsIgnoreCase(str1)){
                break;
            }
        }
        System.out.println("U ARE SUCCESFUULY OUT OF THE LOOP USING BREAK ");
    }   
}
