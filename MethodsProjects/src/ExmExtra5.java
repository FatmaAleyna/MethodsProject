import java.util.Arrays;

public class ExmExtra5 {

    // 5. kendisine parametre olarak gelen bir tam satı dizisini sıralayan ve diziyi geri döndüren metodu yazınız

    public static int[] diziSirala(int dizi[]){


        for (int i = 0; i <dizi.length-1 ; i++) {
            for (int j = 0; j <dizi.length-i-1 ; j++) {
                if (dizi[j]>dizi[j+1]) {
                    int yedek = dizi[j + 1];
                    dizi[j + 1] = dizi[j];
                    dizi[j] = yedek;
                }
            }
        }
        return dizi;
    }

    public static void main(String[] args) {

        int dizi[]={666,544,32,78,16};

        System.out.println(Arrays.toString(diziSirala(dizi)));
    }
}
