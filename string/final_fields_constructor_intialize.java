public class final_fields_constructor_intialize {
    //INSTANCE PROPERTIES
    final int no_of_wheels;
    final String vehicle_name;

    //CONSTRUCTORE TO INTIALIZE THE FINAL VARAIBLE VALUE
    final_fields_constructor_intialize(int no_of_wheels,String vehicle_name)
    {
        this.no_of_wheels=no_of_wheels;
        this.vehicle_name=vehicle_name;
    };

    public static void main(String[] args) {
        /*
         *FIRST OF ALL DECALRE FINAL INSTANCE VARAIBLES final int no_of_wheels,final String vehicle_name
         *CONSTRUCTOR FOR INTIALIZING FINAL VALUES AND IT CAN BE INTIALIZED ONLY ONE TIME WHEN OBJECT "new final_fields_constructor_intialize(4,"ALTO");" IS CREATED
         *
         */
        final_fields_constructor_intialize finalFields=new final_fields_constructor_intialize(4,"ALTO");
    }


}
