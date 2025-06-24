package  challenge1;
public class Square extends Shape 
{
    //ACCESIBLE ONLY INSDIE THE SQUARE CLASS NOT OUTSIDE IT
    private double side;
    //CONSTRUCTOR
    public Square(double side){
        this.side=side;
    }
    //OVERIDING ABSTRACT METHOD THAT HAS BEEN GIVEN BY ABSTRACT CLASS SHAPE
    public void calcualteArea()
    {
        double area=Math.pow(side,2);
        System.out.println("AREA OF A SQUARE IS :- "+ area);
    }
    
}
