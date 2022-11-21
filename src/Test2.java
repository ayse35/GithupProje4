public class Test2 {
    /*
    Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
     */
    public static void main(String[] args) {


    for (int i = 1; i <=9 ; i++) {
        for (int j = 1; j <=i ; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }}}
