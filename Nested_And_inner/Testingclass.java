import packages.challenge.Book;
import packages.challenge.Dvd;
import packages.challenge.Magazine;

public class Testingclass {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.returnitem();
        b1.checkout();
        b1.display();
    System.out.println();
        Magazine mz=new Magazine();
        mz.returnitem();
        mz.checkout();
        System.out.println(mz.getItemId());
        System.out.println(mz.gettitle());
    System.out.println();
        Dvd dvd=new Dvd();
        dvd.returnitem();
        dvd.checkout();
        System.out.println(dvd.getItemId());
        System.out.println(dvd.gettitle());

        

    }
}
