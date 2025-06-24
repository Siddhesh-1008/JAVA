import abstractclass_packages.Car;
import abstractmethod_packages.Car2;
import challenge1.Circle;
import challenge1.Square;
import challenge2.Eagle;
import interface_type.Transport1;
import interface_type.Transport2;
import interface_type.Vehicle;

public class Tester {
    public static void main(String[] args) {
        //ABSTRACT CLASS
        Car c=new Car(5);
        System.out.println(c.get_tier());
System.out.println();
        //ABSTRACT METHOD
        Car2 c2=new Car2(6);
        c2.starting();
System.out.println();
        //INTERFACE
        Vehicle v2=new Vehicle();
        v2.getsetgo();
        v2.getsetgo2();
        //WEARE ACCESSING FUEL VARAIBLE OF TRANSPORT WITH THE HELP OF INTERFACE CLASS AS IT IS STACI AS WELL AS WE CANT CHANGE THE VALUE AS IT IS FINAL
        System.out.println(Transport1.fuel);
        System.out.println(Transport2.fuel);
System.out.println();
       //CHALLENGE 1
        Circle c1=new Circle(5);
        c1.calcualteArea();
        Square sqr=new Square(10.3);
        sqr.calcualteArea();
System.out.println();
        //CHALLENGE2
        Eagle eg=new Eagle();
        eg.fly();
        

        
    }
}
