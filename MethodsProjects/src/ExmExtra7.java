public class ExmExtra7 {

    // 7. kendisine parametre olarak gelen stringteki sayıları toplayıp geri döndüren metod

    public static int sayiToplami(String str){

        int toplam=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)>='0' && str.charAt(i)<='9' ){
                toplam=toplam+(str.charAt(i)-48);
            }
        }
        return toplam;
    }

    public static void main(String[] args) {

        String str="12fat";

        System.out.println(sayiToplami(str));
    }
}
