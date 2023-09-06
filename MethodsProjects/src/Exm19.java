public class Exm19 {

    // 19. kendisine parametre olarak gelen tam sayı dizisindeki en küçük sayının indisini geri döndüren metod

    public static int kucukIndis(int dizi[]){

        int enk=dizi[0];
        int enkindis=0;

        for (int i = 0; i < dizi.length-1 ; i++) {
            if (dizi[i]<enk){
                enk=dizi[i];
                enkindis=i;
            }
        }
        return enkindis;
    }

    public static void main(String[] args) {

        int dizi[]={12,2,3,4,5};

        System.out.println(kucukIndis(dizi));
    }
}
