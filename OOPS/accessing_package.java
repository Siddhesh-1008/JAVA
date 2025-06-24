//AS WE WRITE THIS Package1 pkg1=new Package1();; IT IMPORT Package1 class from folder src/in/knowledgegate.Package1
//import packagename.classname
import java.util.Scanner;
import src.in.knowledgegate.Package1;
import src.in.knowledgegate2.Package2;

//BY DEFAULT IMPORTED System class FROM PACKAGENAME java.lang
//import java.lang.System;

public class accessing_package
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Package1 pkg1=new Package1();
        //WE CAN ACCES IT AS WE HAD MADE MARKS AS PUBLIC
        System.out.println(pkg1.marks);
        //CANT BE ACCESED AS WE HAD MADE std PRIVATE
        // System.out.println(pkg1.std);
        Package2 pkg2=new Package2();
    }
}
