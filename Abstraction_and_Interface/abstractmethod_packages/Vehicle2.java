package abstractmethod_packages;
public abstract class Vehicle2
{
   
    private int no_of_tiers;

    //DECALRING ABSTRACT METHODS
    public abstract void starting();

    public Vehicle2(int no_of_tiers){
        this.no_of_tiers=no_of_tiers;
    }

    public int get_tier(){
        return this.no_of_tiers;
    }

    public void set_tier(int no_of_tiers){
        this.no_of_tiers=no_of_tiers;
    }

    public void commute(){
        System.out.println("going..");
    }
}

