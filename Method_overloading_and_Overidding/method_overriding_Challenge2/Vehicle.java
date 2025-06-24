package method_overriding_Challenge2;
public class Vehicle {
    /*
     * Define a base class Vehicle with a method service() 
     * And a subclass Car that overrides service().
     * In Car's service(), provide a specific implementation that calls super.service() method as well, to show how overriding works.
     */
    public void service(){
        System.out.println("SERVICE CENTER FOR ALL VEHICLES..........");
    }
}
