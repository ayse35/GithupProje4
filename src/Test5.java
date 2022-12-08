import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test5 {
    /*
 Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        char c;
        do { System.out.println("sayı giriniz: ");
            list.add(scanner.nextInt());
            System.out.println("sayı girmek istemiyorsanız x tuşlayınız!!! sayı girmeye devam etmek için y tuşlayın ");
          c=scanner.next().charAt(0)  ;
        }while (c != 'x');
        System.out.println(list);
        int toplam=0;

        for (int w:list) {
            toplam+=w;

        }
        int ortalama=toplam/list.size();

        for (int w:list) {
            if (w>ortalama){
                System.out.print(w+" ");
            }

        }
    }
}
