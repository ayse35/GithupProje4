import java.util.Scanner;

public class Test4 {
    /*
    )İçerisinde string karakterler ile bulunan rakamları sadece rakam şeklinde yazan bir metod yazınız.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str = scan.nextLine();

        sadeceRakam(str);


    }

    private static void sadeceRakam(String str) {

        System.out.println(str = str.replaceAll("\\D", ""));


    }
}
