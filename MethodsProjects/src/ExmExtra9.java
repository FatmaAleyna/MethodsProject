public class ExmExtra9 {

    // 9. kendisine parametre olarak gelen stingteki karakteri büyük yapan metod

    public static String buyukKucuk(String str){

        String bos="";

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                bos=bos+(char)(str.charAt(i)-32);
            }else{
                bos=bos+str.charAt(i);
            }
        }
        return bos;
    }

    public static void main(String[] args) {

        String str="hedeF";

        System.out.println(buyukKucuk(str));
    }
}
