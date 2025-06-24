package  challenge1;
public class Circle extends Shape {

    //ACCESIBLE ONLY INSDIE THE CIRCLE CLASS NOT OUTSIDE IT
    private double radius;
    //CONSTRUCTOR
    public Circle(double radius){
        this.radius=radius;
    };

    //OVERIDING ABSTRACT METHOD THAT HAS BEEN GIVEN BY ABSTRACT CLASS SHAPE
    public void calcualteArea(){
        double ans=Math.PI*Math.pow(radius,2);
        System.out.println("AREA OF A CIRCLE IS:- " + ans);
    }
    
}
