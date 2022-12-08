import java.util.ArrayList;
import java.util.List;

public class Test9 {
    /*
    aşağıdaki örnekte olduğu gibi 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10
     */
    public static void main(String[] args) {
        List<Integer>num=new ArrayList<>();
        List<Integer>list=new ArrayList<>(List.of(1, 2, 3, 5, 6, 7, 8, 10,9));
        for (int i = 1; i <=10; i++) {
            num.add(i);

        }
        System.out.println("num = " + num);
        for (int i = 0; i < num.size(); i++) {
           if (!list.contains(num.get(i))){
               System.out.println("num.get(i) = " + num.get(i));
           }
        }
    }
}
