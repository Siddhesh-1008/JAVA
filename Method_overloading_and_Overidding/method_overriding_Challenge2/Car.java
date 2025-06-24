package method_overriding_Challenge2;
public class Car extends Vehicle {
    @Override
    public void service(){
        super.service();
        System.out.println("CAR SERVEICE CENTER..");
    }
    
}
