public class palindrome_of_string_without_recurssion {
    public static void main(String[] args) {
        String str="tot";
        boolean value=ispalandrome(str);
        if(value)
        {
            System.out.println("NOT A PALANDROME");
        }
        else{
            System.out.println("PALANDROME");
        }
    }

    public static boolean ispalandrome(String str){
        int i=0;
        int len=str.length()/2;
        while(i<len)
        { 
            //str.charat[index number] BASICALLY USED FOR GETTING THE CHARACTER AT THAT INDEX
            if(str.charAt(i)!=(str.charAt(str.length()-1)-i)){
                return true;
            }
            i++;
        }
        return false;
    }

}
