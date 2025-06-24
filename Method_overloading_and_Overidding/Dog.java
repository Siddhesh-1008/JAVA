
public class Dog extends Animal{
    /*
     * THUS DOG CLASS IS OVERRIDING VARIABLE NAME animalspecies and METHOD sound() THAT OF PARENT CLASS
     */
    public String animalspecies="Dog";

    @Override
    public void sound(){
        System.out.println("BHOW,BHOW");
    }
    
}
