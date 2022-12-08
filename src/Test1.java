import java.util.Arrays;
import java.util.Random;

public class Test1 {
    /*
    Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların ortalamasını hesaplayan method
    create ediniz...
     */
    public static void main(String[] args) {
        int []arr =new int[100];
        Random rdm = new Random();
        int toplam=0;
        for (int i = 0; i < 100; i++) {
            arr[i]= rdm.nextInt(1000);
            toplam+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("arr.length: " + arr.length);
        System.out.println("Ortalama: "+(toplam/arr.length));
        int ort= Arrays.stream(arr).sum()/100;
        System.out.println("ort = " + ort);
    }
}
