public class Car3{

    //INSTANCE VARIBALES
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    
    //MAKE USE OF STATIC VARIABLE
    static String type="Car";
 
    //MAKE USE OF STATIC METHOD
    //in STATIC WE CANT PRINT OR USE INSTANCE VARIABLE SUCH AS float maxSpeed;int noOfSeats AND MANY MORE
    //WE CAN ONLY PRINT  static String type="Car";
    //STATIC KE ANDAR STATIC VARAIBLES ACCESS KAR SAKTE AHE BUT NOT INSTANCE VARAIBLE IF WE WNAT O ACCESS INSTANCE VARIABLE THEN WE NEED TO MAKE OBJECT AND THEN ACCCESS IT
    public static void show(){
        System.out.println("STATIC METHOD INTRODUCED");
    }


    //CONSTRUCTOR PARAMETERIZED
    //WHENEVER new Car2() ARE MADE IT WILL CALL THIS CONSTRUCTOR Car2()
   //WE ARE USING this.color=color 
   //BECAUSE U ARE TELLING JAVA TO ASSIGN THE VALUE OF LOCAL PARAMETER(PASSED IN CONSTRUCTOR new Car3(color:"RED"))THAT IS COLOR(local variable)
   //TO THE INSTANCE VARIABLE this.color MEANS String color WHICH IS AN INSTANCE VARIABLE WILL STORE VALUE OF LOCAL PARAMETER
   //AS THIS REFERS TO CURRENT OBJECT swift AND OBJECT SWIFT IS CREATED WITH THE HELP OF CLASS
   //IN SHORT THIS REFERS TO CURRENT OBJECT
   //IF WE WRITE color:color THEN IT WILL GIVE ERROR AS JAVA WILL UNERSTAND THAT U ARE ASSIGNING String color to String Color itself
   //thus no use

    Car3(String color,int noOfSeats)
    {
        noOfWheels=4;
        this.color=color;
        maxSpeed=150;
        currentFuelInLiters=2;
        this.noOfSeats=noOfSeats;

    }

    //IF NO PAARAMTER IS PASSED THEN SET THESE DEAULT VALUES
    //THIS REFERS TO INSTANCE(OBJECT) CONSTRUCTOR
    //CONSTRUCTOR CAHINING
    Car3(){
        this("black",5);

    }

    //INSTANCE METHODS
    public void start()
    {
        //System.out.println(this);
       if(currentFuelInLiters==0)
       {
          System.out.println("CAR IS OUT OF FUEL CANNOT START");
       }
       else if(currentFuelInLiters<3)
       {
          System.out.println("CAR IS IN RESERVE");
       }
       else
       {
          System.out.println("CAR IS STARTED");
       }
    }

    public void drive()
    {
          currentFuelInLiters=currentFuelInLiters-1;
          System.out.println("CAR IS DRIVING");
       
    }
 
    public void addFuel(float fuel)
    {
        //HERE CURRENT FUELLITERS HAS 0.0 VALUE IN IT
        System.out.println("cfl"+currentFuelInLiters);
        //this refers to current object CAR1 OR REFERENCE OF CLASS CAR1
       this.currentFuelInLiters=this.currentFuelInLiters+fuel;
    }
 
 
    public float getFuelLevel()
    {
       return currentFuelInLiters;
    }
 
 }
