public class Exm18 {

    // 18. kendisine arametre olarak gelen tam sayı dizisinin toplamını geri döndüren metod

    public static int diziToplami(int dizi[]){

        int toplam=0;
        for (int i = 0; i <=dizi.length-1 ; i++) {
            toplam=toplam+dizi[i];
        }
        return toplam;
    }

    public static void main(String[] args) {

       int dizi[]={1,2,3,4,5};

        System.out.println(diziToplami(dizi));
    }
}
