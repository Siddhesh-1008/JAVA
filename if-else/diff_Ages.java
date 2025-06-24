import java.util.Scanner;

public class diff_Ages {
    public static void main(String[] args) {
        String type;
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        if (age>=65) {
            type="Senior";
        }
        else if(age>=20){
            type="Adult";
        }
        else if(age>=13){
            type="Teen";
        }
        else{
            type="Child";
        }
        System.out.println("UR TYPE IS=> "+type);

    }
}
