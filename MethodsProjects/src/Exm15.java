public class Exm15 {

    // 15. kendisine parametre olarak gelen stringte kaç tane kelime olduğunu geri döndüren metod

    public static int kelimeSayisi(String str){

        int sayac=1;
        for (int i = 0; i <str.length()-1 ; i++) {
            if (str.charAt(i)==' '){
                sayac++;
            }
        }
        return sayac++;
    }

    public static void main(String[] args) {

        System.out.println(kelimeSayisi("atiyi karanlık görerek azmi bırakmak"));
    }
}
