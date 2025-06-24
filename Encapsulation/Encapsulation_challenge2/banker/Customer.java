package Encapsulation_challenge2.banker;

public class Customer {
    public static void main(String[] args) {
        
        BankAccount ba=new BankAccount("AO5479F", "SIDDHESH");
        ba.deposit_money(1000);
        //INVALID MONEY ENTER
        ba.deposit_money(-5);
        //MONEY WITHDRAWL FROM BALANCE
        ba.withdrawl_money(100);
        //WRONG MONEY VALUE
        ba.withdrawl_money(-1);
        //System.out.println("HOW MUCH BALANCE IS THERE WHOLE RETURN TO U:- "+ba.withdrawl_money(100000));
        System.out.println(ba);

    }
}
