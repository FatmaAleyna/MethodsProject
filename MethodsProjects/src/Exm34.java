public class Exm34 {

    // 34. kendisine parametre olarak gelen 10 elemanlı tam sayı dizisindeki tek elemenalrın ortalamasını geri döndüren metod

    public static int tekOrtalama(int dizi[]){

        int toplam=0;
        int ortalama=0;
        int sayac=0;

        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]%2==1){
                sayac++;
                toplam=toplam+dizi[i];
                ortalama=ortalama+(toplam/sayac);
            }
        }
        return sayac;
    }

    public static void main(String[] args) {

        int dizi[]={1,2,3,4,5,6,7};

        System.out.println(tekOrtalama(dizi));
    }
}
