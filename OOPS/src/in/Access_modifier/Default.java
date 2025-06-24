package src.in.Access_modifier;
public class Default{
    public static void main(String[] args) {
        Public_Private_Access_modifier pm=new Public_Private_Access_modifier(4,4,4);
        //THIS PRICE HAS ACCESS MODIFIER DEFAULT THUS IT CAN ONLY ACCCES BY CLASSES THAT ARE IN THAT PACKAGE FOLDER
        System.out.println(pm.price);
    }
}
