package abstractmethod_packages;

public class Car2 extends Vehicle2{
    public int value;
    //CONSTRUCTOR
    public Car2(int no_of_tiers) 
    {
        super(no_of_tiers);

    }

    //INITALIZING ABSTRACT METHOD THAT HAS BEEN GIVEN BY ABSTRACT PARENT CLASS
    public void starting()
    {
        System.out.println("BUM..BUM..BUM.......");
    }
    
    
}
