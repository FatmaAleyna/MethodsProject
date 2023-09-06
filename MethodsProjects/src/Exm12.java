public class Exm12 {

    // 12. kendisine parametre olarak gelen stringteli küçükleri büyük büyükleri küçük yapan metod

    public static String buyukKucuk(String str){

        String bos="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                bos=bos+(char)(str.charAt(i)-32);
            } else{
                bos=bos+(char)(str.charAt(i)+32);
            }
        }
        return bos;
    }

    public static void main(String[] args) {

        System.out.println(buyukKucuk("AAAbbb"));
    }
}
