import java.util.ArrayList;
import java.util.Arrays;

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

        ArrayList<Integer> list=new ArrayList<>();
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};

        for (int i = 0; i <arr.length ; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println("list = " + list);
        int yeni[]=new int[list.size()];

        for (int i = 0; i <yeni.length ; i++) {
            yeni[i]=list.get(i);
        }
        System.out.println("yeni = " + Arrays.toString(yeni));

        //   System.out.println("yeni = " + yeni);
    }
}
