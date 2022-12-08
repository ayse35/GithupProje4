import java.util.ArrayList;
import java.util.List;

public class Test7 {
    /*
    TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
     */
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        List<Integer>listTekrarsiz=new ArrayList<>();
        for (int w:list) {
            if (!listTekrarsiz.contains(w)){
                listTekrarsiz.add(w);
            }

        }
        System.out.println("listTekrarsiz = " + listTekrarsiz);


    }
}
