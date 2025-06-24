//HOW TO DECLARE PACKAGE package foldername
package src.in.knowledgegate;

import src.in.knowledgegate2.Package2;
public class Package1
{
    public int marks=10;
    //PRIVATE MODIFIERS
    private int std=10;

    public static void main(String[] args)
    {
        //TO IMPORT ANOTHER PACKAGE IN THIS PACKAGE We can do it accrodingly
        Package2 p2=new Package2();
    }
}
