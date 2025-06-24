import java.util.Scanner;

public class add_two_numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("PLEASE ENTER FIRST NUMBER:-");
        int n1=input.nextInt();
        System.out.print("PLEASE ENTER second NUMBER:-");
        int n2=input.nextInt();
        int ans=n1+n2;
        System.out.println("UR ANSWER IS:-"+ans);
    }
    
}


