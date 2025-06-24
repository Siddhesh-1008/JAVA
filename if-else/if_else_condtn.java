public class if_else_condtn{
    public static void main(String[] args) 
    {
        boolean isMale=true;
        if(isMale){
            System.out.println("SIDDHESH");
        }
        else{
            System.out.println("RAJU");
        }
        System.out.println("THANKU UR IFELSE CONDITION HAS BEEN COMPLETED...");
        System.out.println();

        boolean isSeniorCitizen=false;
        boolean isAnAdult=false;
        if(isSeniorCitizen){
            System.out.println("hi senIor citizen");
        }
        else{
            if(isAnAdult){
                System.out.println("HELLO ADULT");
            }
            else{
                System.out.println("HELLO CHILD");
            }
        }
        System.out.println();
        if(isSeniorCitizen){
            System.out.println("hi senior citizen");
        }
        else if(isAnAdult)
        {
            System.out.println("HELLO ADULT");
            
        }
        else
        {
            System.out.println("HELLO CHILD");
        }


    
    
    
    
    }

    
}