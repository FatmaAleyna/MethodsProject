import java.util.Arrays;

public class ExmExtra8 {

    // 8. kendisine parametre olarak gelen iki boyutlu string dizisinin satırlarını birleştirip geri döndüren metod

    public static String[] satirBirlestir(String str [][]){


        String dizi[]=new String[str.length];

        for (int i = 0; i < str.length ; i++) {
            String bos="";
            for (int j = 0; j <str[i].length ; j++) {
                bos=str[i][j];
            }
            dizi[i]=bos;
        }
        return dizi;
    }

    public static void main(String[] args) {

        String s[][]={{"aa","bn"},{"zz","hede"}};

        System.out.println(Arrays.toString(satirBirlestir(s)));
    }
}
