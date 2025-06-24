public class Concatenate_and_convert_uppercas {
   public static void main(String[] args) 
   {

        String fname="Siddhesh";
        String lname="Sawant";
        //IT WILL DO ACCRODINGLY fname.concat(" ") MEANS Siddhesh + " "
        //THEN fname.concat(" ").concat(lname) MEANS Siddhesh + " " + Sawant
        String fullname=fname.concat(" ").concat(lname);
        
        //USING UPPERCASE METHOD
        System.out.println("CONVERTING INTO UPPERCASE:- "+ fullname.toUpperCase());
        //USING PRINTF METHOD
        System.out.printf("UR FULL NAME IS %S %S",fname,lname);

   }
}
