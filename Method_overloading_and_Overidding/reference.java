public class reference{
    public int num;
    int temp;
    public reference(int num){
        this.num=num;
    }

    public reference(){

    }
    public void swap(reference a,reference b){
        temp=a.num;
        //IN reference a WHICH IS ACCESSING VARAIBLE num WE ARE STORING b REFERNCE ACCESSING VARAIBLE num
        //MEANS IN a.num=b.num THAT IS a.num=20 
        //VICE VERSA b.num=10
        //THUS IT WILL CHANGE ORIGINAL reference a and b varaibel values
        a.num=b.num;
        b.num=temp;
        System.out.println(a.num + ","+ b.num);
    }

    public static void main(String[] args) {

        reference a=new reference(10);
        reference b=new reference(20);
        reference c=new reference();
        c.swap(a,b);
System.out.println();
    reference c2=new reference();
        c2.swap(a,b);

        


    }
}