import superkeyword.Car;

public class Test {
    public static void main(String[] args) {
        //SUPER KEYWORD
        Car car=new Car();
        car.start1();
System.out.println();
        //METHOD OVERRIDING
        Dog dog=new Dog();
        System.out.println(dog.animalspecies);
        dog.sound();

    }
}
