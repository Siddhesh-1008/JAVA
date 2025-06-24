package src.in.Access_modifier;
public class Public_Private_Access_modifier
{
    //FIRST OF ALL MAKE INSTANCE VARAIBLES(PROPERTEIS) AND ASSIGN THEM ACCESS MODIFIERS
    //THEN MAKE ANOTHER PACKAGE AND ACCESS PUBLIC VARIABLES
    public int no_of_wheels;
    public int no_of_Seats;
    private int fuel_purchase;
    //DEFAULT MODIFIER
    long price=1000;

    //CONSTRUCTOR
    public Public_Private_Access_modifier(int no_of_wheels,int no_of_Seats,int fuel_purchase){
        this.no_of_wheels=no_of_wheels;
        this.no_of_Seats=no_of_Seats;
        this.fuel_purchase=fuel_purchase;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("Public_Private_Access_modifier ");
        sb.append("{ no_of_wheels:").append(no_of_wheels);
        sb.append(", no_of_Seats:").append(no_of_Seats);
        sb.append(", fuel_purchase:").append(fuel_purchase).append("}");
        return sb.toString();
    }

    

}
