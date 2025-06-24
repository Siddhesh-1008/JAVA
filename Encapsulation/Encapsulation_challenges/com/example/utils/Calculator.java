package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator 
{
    public static void main(String[] args)
    {
        /*
         * CREATE A PACAKGE COM.EXAMPLE.GEOMETRY AND PACAKGE COM.EXAMPLE.UTILS 
         * IN THAT GEOMETRY PACKAGE CREATE CIRCLE AND RECTANGLE CLASS
         * IN THAT UTILS PACAKGE CREATE CLASS CALCULATOR
         * NOW IN CALCULATOR CLASS CREATE OBJECTS OF CLASS CIRCLE AND  CLASS RECTANGLE
         * NOW PASS VALUE TO RECTANGLE AND CIRCLE CONSTRUCTOR
         * THEN CARRY OUT CALCULATION IN CALCULATOR.JAVA 
         * THEN PRINT IT IN CALCULATOR.JAVA
         */
        Circle circ=new Circle(5.5);
        Rectangle rect=new Rectangle(10,5);
        double circlearea=Math.PI*Math.pow(circ.radius,2);
        double rectangle_area=rect.length*rect.breadth;
        System.out.printf("AREA OF CIRCLE IS:- %f \nAREA OF RECTANGLE IS:- %f",circlearea,rectangle_area);
    }
}
