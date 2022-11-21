import java.util.Arrays;
import java.util.Random;

public class Test3 {
    /*
    Rastgele sayılardan oluşan 100 elemanlık tamsayı dizisi oluşturun.
     Ardından tek ve çift sayıları bulan bir method create ediniz

     */
    public static void main(String[] args) {

        int [] rastgeleArr = new int[100]; // Rastgele sayilar icin 100 elemanlik Array creat edildi

        Random rdm = new Random(); // Rastgele sayi uretmek icin Random Classindan obje olusturuldu.

        int sayac = 0; // whileLoop kosulu icin sayac olusturuldu.
        while (sayac < 100) {

            int rastgeleSayi = rdm.nextInt(500) + 1; // 1 ile 500 arasinda rastgele sayi uretecek
            rastgeleArr[sayac] = rastgeleSayi; // Rastgele olusturulan her sayi Array`e eklendi.
            sayac++;
        }
        System.out.println("Rastgele sayılardan oluşan 100 elemanlı Array: "+Arrays.toString(rastgeleArr));
        System.out.println("rastgeleArr Eleman Sayisi: = " + rastgeleArr.length);

        tekCiftSayiBulma(rastgeleArr);

    }

    private static void tekCiftSayiBulma(int[] rastgeleArr) {
        int tekSayiAdet = 0;
        int ciftSayiAdet = 0;

        System.out.print("\nCift Sayilar: ");
        for (int i = 0; i < rastgeleArr.length; i++) {

            if (rastgeleArr[i] % 2 == 0) {
                System.out.print(rastgeleArr[i] + " ");
                ciftSayiAdet++;
            }
        }
        System.out.println("\nCift Sayi Adedi: " + ciftSayiAdet);

        System.out.print("\nTek Sayilar: ");
        for (int i = 0; i < rastgeleArr.length; i++) {

            if (rastgeleArr[i] % 2 == 1) {
                System.out.print(rastgeleArr[i] + " ");
                tekSayiAdet++;
            }
        }
        System.out.println("\nTek Sayi Adedi: " + tekSayiAdet);

    }


}
