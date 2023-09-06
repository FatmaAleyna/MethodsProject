import java.lang.reflect.Array;
import java.util.Arrays;

public class Exm21 {

    // 21. kendisine parametre olarak gelen tam sayı dizisinin her bir elemanını 1 artırıp geri döndüren metod

    public static int[] birArtir(int dizi[]){

        int dizi2[]=new int[dizi.length];
        for (int i = 0; i <=dizi.length-1 ; i++) {
            dizi2[i]=dizi[i]+1;
        }
        return dizi2;
    }

    public static void main(String[] args) {

        int dizi[]={1,2,3,4,5};
        System.out.println(Arrays.toString(birArtir(dizi)));
    }
}
