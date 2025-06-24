
import java.util.Scanner;

public class Circum_Area_circle {
    double radius;

    Circum_Area_circle(double radius)
    {
        this.radius=radius;
    };

    public double getCricum()
    {
        return 2*Math.PI*radius;
    };

    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() 
    {
        return "WELCOME TO CRICLE AREA AND CIRCUM CALCULATOR:- \n"+ "UR CIRCUMFERENCE IS:- " + getCricum() +"\nUR AREA IS:- "+getArea();
    }
    
    public static void main(String[] args)
    {
        //GET THE RADIUS FROM USER USING SCANNER CLASS
        //PASSED IT TO CONSTRUCTOR Circum_Area_circle circle=new Circum_Area_circle(radius);
        //THEN CREATE TWO METHODS OF CIRCUM AND AREA
        //THEN CALLED THESE BOTH FUNCTIONS IN TO STRING MEHOD BY OVERRIDING DEFAULT TO STRING METHOD
        //THEN CALLED THE TWO STRING METHOD IN psvm USING System.out.println(circle.toString());
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER RADIUS:- ");
        double radius=input.nextDouble();
        Circum_Area_circle circle=new Circum_Area_circle(radius);
        System.out.println(circle.toString());
    }
}
