package package01.equals;

import java.util.Objects;

public class Person
 {
    // Private fields
    private String name;
    private int age;
    private String id;

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    //OBJECT EQUALS
    @Override
    public boolean equals(Object obj) {
        System.out.println("PERSON2 OBJECT ADDREESS:- "+obj);
        //TO CHECK WHETEHR PERSON2 OBJECT IS A OBJECT OF PERSON OR NOT
        if(!(obj instanceof Person)){
            return false;
        }
        Person per=(Person) obj;
        return per.name.equals(name) && per.age==age && per.id.equals(id);

    }

    //BASICALLY IT GENRATE UNIQUE HASHCODE FOR OBJECT BASED ON ADDING VALUES(name,age,id) OF PERSON OBJECT
    //IT DEPENDS UPON USER WHETHER U NEED TO ADD ALL VALUES AND GENERATE A HASH CODE ON IT
    //OR ADD ONLY ONE VALUE AND GENERATE HASH CODE ON IT
    @Override
    public int hashCode() 
    {
        return Objects.hash(name,age,id);
    }

    
    
        
    


    
}
