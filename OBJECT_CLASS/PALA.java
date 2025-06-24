public class PALA {
    public int number;

    public PALA(int number){
        this.number=number;
    }

    public int armstrong(){
        //COPY KAR INPUT NUMBER VALUE 
        int n=this.number;
        int power=counter();
        int lastdigit;
        int val=0;
        while(n>0)
        {
            lastdigit=n%10;
            val=val+addallvalues(lastdigit,power);
            n=n/10;

        }
        return val;
        
        
    }

    public int addallvalues(int lastdigit,int power){
        int multiply=1;
        for(int i=1;i<=power;i++){
            multiply=multiply*lastdigit;
        }
        return multiply;
    }

    public int counter(){
        int count=0;
        while (number>0) 
        { 
            number=number/10;
            count+=1;
        }
        return count;
    }
    
    public static void main(String[] args) {
        PALA p1=new PALA(153);
        int arm=p1.armstrong();

        //System.out.println(arm);
        if(arm == 153){
            System.out.println("ARRMSTRONG");
        }
        else{
            System.out.println("NOT AN ARMSTRONG");
        }
       
       
    }
}

