package packages2.getter_Setter_2;
import Packages.getter_Setter.Car;

public class Access_getter {
    public static void main(String[] args) {
        Car c1=new Car("MARUTI","BLACK",4,6);
        System.out.printf("%S %S \n",c1.getColor(),c1.getCarName());
        
        //SETTER METHOD TO SET THE VALUES
        c1.setnoofwheels(0);
        System.out.printf("UR CAR HAS %d WHEELS \n",c1.getnoofwheels());
        
        c1.setColor("yellow");
    
    }

    

}
