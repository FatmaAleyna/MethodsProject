public class Exm16 {

    // 16. kendisine parametre olarak gelen stringte a karakterinin olup olmadığını geri döndüren metod

 public static boolean aVArMi(String str){

     boolean kontrol=false;
     for (int i = 0; i <str.length()-1 ; i++) {
         if (str.charAt(i)=='a'){
             kontrol=true;
         }else
             kontrol=false;
     }
     return kontrol;
 }

    public static void main(String[] args) {

        System.out.println(aVArMi("hede"));
    }
}
