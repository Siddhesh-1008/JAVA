package interface_type;

public class Vehicle implements Transport1,Transport2{
    @Override
    public void getsetgo(){
        System.out.println("BRUM..BRUM FOR TRANSPORT1 ");
    }
    public void getsetgo2(){
        System.out.println("BRUM..BRUM FOR TRANSPORT2");
    }

    
}
