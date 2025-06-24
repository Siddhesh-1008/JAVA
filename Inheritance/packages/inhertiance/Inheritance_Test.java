package packages.inhertiance;

import packages2.inhertiance2.Tester_for_protected_access_modifier;

public class Inheritance_Test 
{

public static void main(String[] args)
{
        //WE DONOT NEED TO IMPORT AS THEY BELONGS TO SAME PACKAGE
        Vehicle vech=new Vehicle();
        vech.commute();
System.out.println();
System.out.println();
        //HERE Two_wheeler IS EXTENDING PROPERTIES AND METHODS OF VEHICLE CLASS 
        Two_wheeler twowheel=new Two_wheeler();
        //System.out.printf("FROM VEHICLE TO TWO_WHEELER CLASS WE HAVE %d NO OF WHEELS AND AFTER THAT TWO WHEELER CLASS HAS CHANGED NO OF WHEELS TO %d \n",vech.noOfWheels,twowheel.noOfWheels);
        twowheel.commute();
        twowheel.balance();
System.out.println();
        Motorcycle mc=new Motorcycle();
        mc.commute();
        mc.balance();
        mc.start();
System.err.println(" ");
        Tester_for_protected_access_modifier protected_Access=new Tester_for_protected_access_modifier();
        protected_Access.protected_modifier();
}

}
