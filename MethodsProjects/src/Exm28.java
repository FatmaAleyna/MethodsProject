import java.util.Arrays;

public class Exm28 {

    // kendisine parametre olarak gelen iki boyutlu sayısal dizideki her bir satırın toplamını geri döndüren metod

    public static int[] satirToplam(int dizi[][]){

        int yenidizi[]=new int[dizi.length];

        for (int i = 0; i <dizi.length ; i++) {
            int satirtoplam=0;
            for (int j = 0; j <dizi[i].length ; j++) {
                satirtoplam=satirtoplam+dizi[i][j];
            }
            yenidizi[i]=satirtoplam;
        }
        return yenidizi;
    }

    public static void main(String[] args) {

        int dizi[][]={{4,2},{3,4}};
        System.out.println(Arrays.toString(satirToplam(dizi)));
    }
}
