
public class Lec5 {

    /**
     *
     * @param args MARKS ABOVE 90 PRINT EXCELLENT 
     * MARKS ABOVE 80 AND LESS THANEQL TO 90 PRINT GOOD 
     * MARKS ABOVE 70 AND LESS THAN EQUAL TO 80 PRINT FAIR
     * MARKS ABOVE 60 AND LESS THAN EQULA TO 70 PRINT MEET EXCEPTATIONS MARKS
     * LESS THAN EQL TO 60 PRINT FAIL
     */
    public static void main(String[] args) {
      int marks=90;

      if (marks>=90)
      {
        System.out.println("EXCELLENT");
      }
      else if(marks >=80){
        System.out.println("GOOD MARKS");
      }
      else if(marks >=70){
        System.out.println("FAIR");
      }
       else if(marks >=60){
        System.out.println("MEETS EXCEPTATION MARKS");
      }
      else{
        System.out.println("FAIL");
      }
    

    }
}
