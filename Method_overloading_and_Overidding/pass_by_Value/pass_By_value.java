package pass_by_Value;
public class pass_By_value{

    public int a;
    public int b;

    public int add(int x,int y){
        //int ans=a+b;
        x=10;
        return x;
    }


    public static void main(String[] args) {
        pass_By_value pv=new pass_By_value();
        int x=5;
        int y=10;
        int ans=pv.add(x,y);
        //THUS IF U SEE IN ADD METHOD WE ARE UPDATING VARIABLE x BUT IT WONT AFFECT ORIGINAL VARAIBLE x HERE 
        System.out.println("{x: " + x +",y:" +y + "}\n"+ "ans" + ans);
        
    }
}
