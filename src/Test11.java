import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test11 {
      /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */
      public static void main(String[] args) {
          List<Integer>list=new ArrayList<>(List.of(12, 11, 12, 15, 12, 34, 43));
          Collections.replaceAll(list,12,20);
          System.out.println("list = " + list);
      }
}
