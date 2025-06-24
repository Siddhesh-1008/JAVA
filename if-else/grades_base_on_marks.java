import java.util.Scanner;

public class grades_base_on_marks {
    public static void main(String[] args) {
        //ALWAYS MOVE FROM TOP VALUES TO LOW VALUES
        System.out.println("WELCOME TO GRADE CALCULATOR");
        String grade;
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE ENTER THE MARKS");
        float marks=input.nextFloat();
        if(marks>=90){
            grade="A";
        }
        else if(marks>=75){
            grade="B";
        }
        else if(marks>=60){
            grade="C";
        }
        else if(marks>=30){
            grade="D";
        }
        else{
            grade="FAIL";
        }
        System.out.println("UR GRADE IS-> "+grade);
    }
}
