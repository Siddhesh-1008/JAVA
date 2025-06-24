
import java.util.Objects;

public class Person {
    public String name;
    public int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof  Person)){
            return false;
        }
        Person per=(Person) obj;
        return per.name==name && per.age==age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    

    
}
