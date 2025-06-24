package passed_by_reference;
public class demo {
    public static void main(String[] args) {
    Point p1=new Point(3,8);
    System.out.println(p1);
    Point p2=new Point(80,21);
    System.out.println(p2);
    double dist=p1.find_Dist(p2);
    System.out.println(dist);
    //AS IN find_Dist METHOD WE ARE CHANGING VARIABLE VALUE x WITH RESPECT TO POINT p2 REFERENCE THUS IT WILL CHANGED  ORIGINAL VARAIBLE x VALUE OF POINT p2 REFERENCE
    System.out.println(p2);
    double dist1=p1.find_Dist(p2);
    System.out.println(dist1);

    }
}
