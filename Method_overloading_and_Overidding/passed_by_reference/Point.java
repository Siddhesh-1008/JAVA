package passed_by_reference;
public class Point {
    private double x;
    private double y;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double find_Dist(Point p2){
        /*
         * this.x REFERS TO CURRENT Point OBJECT REFERENCE(p1) VARIABLES THAT IS x AND y
         * p2.x,p2.y REFERS TO Point OBJECT REFERENCE(p2) VARIABLES THAT IS x AND y 
         * NOW HERE p2.x=90  MEANS U ARE CHANGING POINT p2 VARAIBLE VALUE AND IT WILL REFLECT ORIGINAL VARIABLE OF POINT p2
         */
        double dist=Math.sqrt(Math.pow((this.x-p2.x),2)+Math.pow((this.y-p2.y),2));
        p2.x=90;
        return dist;    
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("Point{");
        sb.append("x:").append(x);
        sb.append(", y:").append(y);
        sb.append("}");
        return sb.toString();
    }

    
}
