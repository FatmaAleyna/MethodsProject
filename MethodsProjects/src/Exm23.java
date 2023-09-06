public class Exm23 {

    // 23. kendisine parametre olarak gelen tam sayı dizisindeki en büyük ikinci saıyı geri döndüren metod

    public static int ikinciBuyuk(int dizi[]){


        int enb1=dizi[0];
        int enb2=dizi[1];
        if (enb2>enb1){
            enb2=enb1;
            enb1=enb2;
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]>enb1){
                enb2=enb1;
                enb1=dizi[i];
            }
        }
        return enb2;
    }

    public static void main(String[] args) {

        int dizi[]={145,23,34,431,566};
        System.out.println(ikinciBuyuk(dizi));
    }
}
