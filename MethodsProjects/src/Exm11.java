public class Exm11 {

    // 11. kendisine parametre olarak gelen stringteki küçük kar büyük yapıp geri döndüren metod

    public static String kucukBuyuk(String str){

        String bos="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                bos=bos+(char)(str.charAt(i)-32);
            } else{
                bos=bos+str.charAt(i);
            }
        }
        return bos;
    }

    public static void main(String[] args) {

        System.out.println(kucukBuyuk("AAAbcd"));
    }
}
