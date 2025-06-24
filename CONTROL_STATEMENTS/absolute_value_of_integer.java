import java.util.Scanner;

public class absolute_value_of_integer {
    public static void main(String[] args) {

        //ABSOLUTE VALUE OF INTEGER MEANS
        //ABSOLUTE VALUE OF POSITIVE INTEGER THAT IS 45 IS 45 
        //BUT ABSOLUTE VALUE OF NEGATIVE INTEGER THAT IS -45 IS 45
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER VALUE-");
        int number=input.nextInt();
        absolute_value_of_integer abs=new absolute_value_of_integer();
        abs.show(number);


    }

    /**
     * ABSOLUTE VALUE LOGIC
     * public static void main(String[] args) {
        
    } */
    public void show(int number){
        //MAKE USE OF UNARY OPERATOR TO CONVERT NEGATIVE NUMBER TO POSITIVE NUMBER 
        int absolutevalue=number>=0?number:-(number);
        System.out.println("UR ABSOLUTE VALUE FOR INTEGER "+ number +" IS :- " + absolutevalue);
    }


}
