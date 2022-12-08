import java.util.ArrayList;
import java.util.List;

public class Test6 {
    /*
    Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3,4));
        int toplam=0;
        for (int w:list) {
            toplam+=Math.pow(w,2);
        }
        System.out.println(toplam);
    }
}
