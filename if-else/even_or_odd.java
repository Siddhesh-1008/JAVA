import java.util.Scanner;
public class even_or_odd {
    public static void main(String[] args) 
{
        Scanner input=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER TO SEE IF IT IS EVEN OR ODD");
        int number=input.nextInt();
        if(number%2==0){
            System.out.println("NUMBER IS EVEN..");
        }
        else if(number%2!=0){
            System.out.println("NUMBER IS ODD..");
        }
        else{
            System.out.println("SOMETHING WENT WRONG..");
        }
        
    
}

}
