public class Testingclass2 {
public static void main(String[] args) {
    Person p1=new Person("SIDDHESH", 20);
    Person p2=new Person("SIDDHESH", 20);

    //compare two objects and see whther they are same or not
    if(p1.equals(p2)){
        System.out.println("UR BOTH OBJECTS VALUES ARE SAME");
    }
    else{
        System.out.println("UR OBJECT VALUES ARE NOT SAME");
    }

    System.out.println("COMPARISION OF HASHED CODE");
    if(p1.hashCode()==p2.hashCode())
    {
        System.out.println("UR BOTH OBJECTS VALUES ARE SAME");
    }
    else{
        System.out.println("UR OBJECT VALUES ARE NOT SAME");
    }
}

    
}
