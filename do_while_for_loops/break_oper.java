public class break_oper{
    public static void main(String[] args) {
        //WAP TO ALLOW THE CODE TO JUMP OUT OF FOR LOOP ONCE CONDTION IS MET IN IF LOOP 
        //JUMP OUT OF THE LOOP WITH THE HELP OF BREAK STATEMENT
        System.out.println("BREAK LOOP");
        System.out.println("INSIDE THE LOOP" );
        for(int i=0;i<1000;i++){
            System.out.println(i);
            if(i==101){
                break;
            }
        }
        System.out.println("OUT OF LOOP");
    }
    
}
