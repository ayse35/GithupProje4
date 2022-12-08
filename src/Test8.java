import java.util.ArrayList;
import java.util.List;

public class Test8 {
    /*
    ASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 2. elemani ile
         * 7. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
     */
    public static void main(String[] args) {
        List<String>isimler=new ArrayList<>(List.of("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
    String s=isimler.get(2);
    isimler.set(2, isimler.get(7));
    isimler.set(7,s);
        System.out.println("isimler = " + isimler);
    }
}
