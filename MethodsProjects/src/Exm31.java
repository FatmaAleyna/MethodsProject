import java.util.Arrays;

public class Exm31 {

    // 31. kendisine parametre olarak gelen tek boyutlu sayısal diziyi bir sağa kaydırıp geri döndüren metodu yazınız

    public static int[] sagaDondur(int dizi[]){

int yedek=dizi[9];

        for (int i = dizi.length-2; i >= 0 ; i--) {

            dizi[i+1]=dizi[i];
        }
        dizi[0]=yedek;
        return dizi;
    }

    public static void main(String[] args) {

        int dizi[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(sagaDondur(dizi)));
    }
}
