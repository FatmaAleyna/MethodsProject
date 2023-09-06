import java.util.Arrays;

public class Exm27 {

    // 27. kendisine parametre olarak gelen iki boyutlu tam sayı dzisindeki en büyük elmanın indisini geri döndüren metod

    public static int[] indisDondur(int dizi[][]){
        int enb=dizi[0][0];
        int sat=0;
        int sut=0;
        int yenidizi[]=new int[2];

        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j]>enb){
                    enb=dizi[i][j];
                    sat=i; yenidizi[0]=sat;
                    sut=j; yenidizi[1]=sut;
                }
            }
        }
        return yenidizi;
    }

    public static void main(String[] args) {

        int dizi[][]={{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(indisDondur(dizi)));
    }
}
