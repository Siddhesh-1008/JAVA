import java.util.Scanner;

public class password_checker {
    public static void main(String[] args) {
        //VALID PASSWORD CHECKER MEANS PASSWORD LENGTH MUST BE GREATER THAN 6
        //ONCE WHILE CONDITION GETS EQL TO FALSE THEN JUMP OUT OF THE LOOP 
        //IF TRUE THEN REMIAN INSIDE THE LOOP
        //HERE IF isValidPwd(String pwd) RETURNS TRUE THEN while(!isValidPwd(pwd)) !isValidPwd(pwd) RESULTS INTO FALSE THUS JUMP OUT OF THE LOOP
        //HERE IF isValidPwd(String pwd) RETURNS FALSE THEN while(!isValidPwd(pwd)) !isValidPwd(pwd) RESULTS INTO TRUE THUS DONT JUMP OUT OF THE LOOP
        Scanner input=new Scanner(System.in);
        System.out.println("PASSWORD CHECKER");
        String pwd;
        boolean isValidPwd;
        do 
        { 
            System.out.print("ENTER THE PASSOWRD:- ");
            pwd=input.next();
        } while(!isValidPwd(pwd));
        System.out.println("UR PASSWORD IS VALID:- " + pwd);
        
    }
    public static boolean isValidPwd(String pwd){
        if(pwd.length()>6)
        {
            return  true;
        }
        else{
            return false;
        }
        
    }
}
