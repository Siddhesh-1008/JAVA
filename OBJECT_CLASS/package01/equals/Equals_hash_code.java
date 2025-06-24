
package package01.equals;

public class Equals_hash_code 
{
    public static void main(String[] args) 
    {
    Person p1=new Person("SIDDHESH", 20, "001");
    Person p2=new Person("SIDDHESH", 20, "001");
    System.out.println("PERSON1 OBJECT ADRRESS "+p1 + "," + "PERSON1 OBJECT ADRRESS " + p2);
    //NOW IF WE WANT TO COMPARE TWO OBJECTS AS WELL AS VALUE IN IT
    //FIRST THING WE CANNOT USE == OR .equals AS BOTH COMPARE THE REFERENCE NOT OBJECTS CONTENT
    //BUT IF WE USE .EQUALS WHILE COMPARING STRING OBJECT IT IS COMPARING VALUES
    //BECAUSE AT THAT TIME THAT .EQUALS MEHTOD IS OF STRING OBJECT AND NOT OF OBJECT CLASS
    //SO WHENEVER IF U NEED TO COMPARE TWO OBJECTS U NEED TO MAKE .EQUALS METHOD OF EACH CLASS
    if(p1.equals(p2))
    {
        System.out.println("UR OBJECT VALUES ARE EQUAL");
    }
    else
    {
        System.out.println("UR OBJECT VALUES ARE NOT EQUAL");
    }
    System.out.println("PERSON P1 HASHED CODE "+ p1.hashCode());
    System.out.println("PERSON P2 HASHED CODE "+p2.hashCode());
}
    
}
