
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER NAME:- ");
        // USED FOR TAKING THE INPUT FROM USER in string
        String name=input.nextLine();
        // System.out.println("GOOD MORNIG "+name);

        //Used for taking user input in integer
        System.out.print(name + " PLEASE TELL UR AGE:- ");
        int age=input.nextInt();
        System.out.println("GOOD MORNIG "+ name +" AND UR AGE IS "+ age);
        
        //USED FOR TAKING WEIGHT IN FLOAT
        System.out.print(name + " PLEASE TELL ME UR WEIGHT:- ");
        float weight=input.nextFloat();
        System.out.println(name + " WEIGHT IS:-" + weight);



    }
}
