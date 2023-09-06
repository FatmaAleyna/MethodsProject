import java.util.Arrays;

public class ExmExtra12 {

    // 12. diziyi bir sağa döndüren metod

    public static int[] sagaDondur(int dizi[]){

        int yedek=dizi[0];

        for (int i = 1; i <= dizi.length-1 ; i++) {

            dizi[i-1]=dizi[i];
        }
        dizi[9]=yedek;
        return dizi;
    }

    public static void main(String[] args) {

        int dizi[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(sagaDondur(dizi)));
    }
}
