package Packages.getter_Setter;

public class Car{
    
        //GETTER SETTER TELLS MAKE EVERY INSTANCE PROPERTIES PRIVATE
        //AND IF ANY OTHER CLASS WANT TO ACCESS THIS PROPERTIES IT CAN ACCESS IT THROUGH METHODS
        //JUST MAKE UR METHOD PUBLIC SO TAHT ANY CLASS CAN ACCES IT FROM ANYWHERE
        private String carname;    //MAKE PUBLIC
        private String color;      //MAKE PUBLIC
        private int no_of_wheels; 
        private int no_of_Seats;   


        //CONSTRUCTOR MAKE IT PUBLIC
        public Car(String carname,String color,int no_of_wheels,int no_of_Seats)
        {
            this.carname=carname;
            this.color=color;
            this.no_of_wheels=no_of_wheels;
            this.no_of_Seats=no_of_Seats;
        }
        //GETTER METHOD
        //U CAN ACCESSES INSTANCE PROPERTIES IN INSTANCE METHODS DIRECTLY BUT NOT DIRECTLY IN STATIC METHODS WE NEED TO CREATE OBJCT TO ACCSS IT
        //GETTER METHOD USED FOR GETTING THE VALUES
        public String getColor(){
            return color;
        }

        public void setColor(String color){
            if(color.equals("yellow"))
            {
                System.out.println("PAGAL HO KYA");
            }
            else{
                this.color=color;
            }
        }

        public String getCarName(){
            return carname;
        }

        

        public int getnoofwheels(){
            return no_of_wheels;

        }

        //SETTER METHODS USED FOR SETTING THE VALUES TO THE VARAIBLES
        public void  setnoofwheels(int no_of_wheels){
            this.no_of_wheels=no_of_wheels;
        }



        


}