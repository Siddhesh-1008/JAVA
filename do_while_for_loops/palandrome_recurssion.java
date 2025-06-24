
import java.util.Scanner;

public class palandrome_recurssion{
    public static void main(String[] args) 
    {
        //GET THE STRING FROM USER
        //THEN CHECK WHETHER STRING LENGTH IT IS SAMLLER THAN 1 IF YES THEN RETURN IT IS A PLANDROME
        //THEN CHECK FO STARTING AND LAST INDEX WHETHER THEY MATCH IF DIDNT MATCHED THEN IT IS NOT A PALANDROME
        //TO GET THE INDEX OF STRING MAKE USE OF string.charAt(index no)
        //THEN AGAIN RECURSIVE CALL FOR SUBSTRING  OF A STRING MEANS REMOVE STARITNG AND LAST CAHR FROM STRING 
        //AND THEN APPLIED SAME PROCDURE FOR SUBSTRING
        Scanner input=new Scanner(System.in);
        System.out.println("WELOCOME TO PALANDROME CHECKER FOR A STRING:- ");
        System.out.print("ENTER THE STRING:- ");
        String str=input.next();
        boolean palandrome=isPalandrome(str);
        System.out.println(palandrome?"YES IT IS PALANDORME":"NO IT IS NOT A PALANDROME");
    }

    public static boolean isPalandrome(String str){
        //IF STRING HAS ONLY ONE LETTER(CHAR) THEN IT IS A PALANDROME
        if(str.length()<=1)
        {
            return true;
        }

        //CHECK WHETHER THE STARTING AND LAST POISITION INDEX CAHRACTER ARE SAME OR NOT SAME
        //IF NOT SAME THEN IT IS NOT A PALANDROME
        int i=0;
        int lastposition=str.length()-1;
        if(str.charAt(i)!=str.charAt(lastposition))
        {
            return false;
        }
        /*
        HERE BEGINING INDEX IS INCLUSIVE WHILE lastposition IS EXCLUSIVE(NOT INCLUDED)
         String substring=str.substring(beginIndex:1, lastposition)
         str=nitin

        SUBSTRING nitin MENAS CONSIDER INDEX 1 THAT IS i AND LAST POSITION INDEX IS 3 THAT IS i
                substring=iti 
        SUBSTRING iti MENAS CONSIDER INDEX 2 THAT IS t AND LAST POSITION INDEX IS 2 THAT IS t 
         substring=t
         */
        String substring=str.substring(1, lastposition);
        return isPalandrome(substring);
    }
    
}
