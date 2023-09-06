public class Exm13 {

    // 13. kendisine parametre olarak gelen stringte kaç tane aa stringi olduğunu geri döndüren metod

    public static int aaBul(String str){

        int sayac=0;
        for (int i = 0; i <str.length()-1 ; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'a') {
                i++;
                sayac++;
            }
        }
        return sayac;
    }

    public static void main(String[] args) {

        System.out.println(aaBul("aaaaaaaa"));
    }
}
