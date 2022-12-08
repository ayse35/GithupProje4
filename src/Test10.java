import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test10 {
    /*
    Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
   */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("dizi uzunluğunu giriniz: ");
        int length = scanner.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.println("dizinin " + i + ".  index elemanını giriniz: ");
            int eleman = scanner.nextInt();
            arr.add(eleman);

        }
        ArrayList<Integer> arrTekrarElemani = new ArrayList<>();
        ArrayList<Integer> arrYeni = new ArrayList<>();
        System.out.println("arr = " + arr);
        int len = arr.size();
        for (int i = 0; i < len; i++) {


            if (!arrYeni.contains(arr.get(i))) {
                arrYeni.add(arr.get(i));

            } else {
                arrTekrarElemani.add(arr.get(i));
            }


        }
        System.out.println("arrTekrarElemani = " + arrTekrarElemani);
        System.out.println("arrYeni = " + arrYeni);
    }
}