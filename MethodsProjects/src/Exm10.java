public class Exm10 {

    // 10. kendisine parametre olarak gelen stringi ters çevitip geri döndüren metodu yaz

    public static String tersCevirme(String str){

        String bos="";
        for (int i = str.length()-1; i >=0 ; i--) {
            bos=bos+str.charAt(i);
        }
        return bos;
    }

    public static void main(String[] args) {

        System.out.println(tersCevirme("aleyna"));
    }
}
