import java.util.Scanner;

public class greatest_of_three_num {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE NUMBER TO SEE WHICH IS MAX FROM BELOW NUMBERS");
        int number1=input.nextInt();
        int number2=input.nextInt();
        int number3=input.nextInt();
        if(number1>=number2 && number1>=number3){
            System.out.println(number1 + "->IS THE GREATEST NUMBER");
        }
        else if(number2>=number1 && number2>=number3){
            System.out.println(number2 + "->IS THE GREATEST NUMBER");
        }
        else{
            System.out.println(number3 + "->IS THE GREATEST NUMBER");
        }

    }
}


