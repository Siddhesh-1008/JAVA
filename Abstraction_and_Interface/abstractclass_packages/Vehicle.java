package abstractclass_packages;
//ABSTRACT CLASS
public abstract class Vehicle 
{
    /*
     * CREATE ABSTRACT CLASS 
     * ONCE CREATED ABSTRACT CLASS U CANT MAKE ITS OBJECT
     * TO ACCESS THIS ABSTRACT CLASS CHILD CLASS WILL INHERIT IT AND WITH THE HELP OF IT WE CAN ACCES ITS METHODS
     */
    private int no_of_tiers;

    public Vehicle(int no_of_tiers){
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

