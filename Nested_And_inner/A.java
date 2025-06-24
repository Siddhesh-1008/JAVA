public class A
{
    //THIS INT CAN BE ACCEESED ANYWHERE IN DIFFERENT inner CLASSES INSIDE THE MAIN CLASS
    private int a=10;

    public void show()
    {
        System.out.println("HI I AM FROM CLASS A");
    }

    //FIRST INNNER CLASS
    public class B
    {
        public void config()
        {
            System.out.println("I AM INNER CLASS B " + a);
        }

    }

    //SECOND INNER CLASS
    public static class C
    {
        public void  config2() 
        {
            System.out.println("HI I AM  STATIC INNER CLASS");
        }

        public static void  config3() 
        {
            System.out.println("HI I AM  STATIC INNER CLASS");
        }
        
    }

    public static void main(String[] args)
    {
        A obj1=new A();
        obj1.show();
        //TO ACCESS INNER CLASS 
        //B CLASS IS NOT OPEN FIRST WE NEED TO ACCESS A AND THEN B
        //TO CREATE OBJECT OF INNER CLASS FIRST WE NEED TO SPECIFY MAIN_CLASS.INNER_CLASS object_name=OBJECT_NAME_OF_MAIN CLASS.new INNER_CLASS()
        A.B obj2=obj1.new B();
        obj2.config();

        //ALWAYS REMEMBER UR MAIN CLASS WILL BE PUBLIC FINAL ABSTRACT
        //BUT UR INNER CLASS CAN BE PROTECTD PRIVATE DEFAULT
        A.C obj3=new A.C();
        obj3.config2();
        C.config3();



    }
}