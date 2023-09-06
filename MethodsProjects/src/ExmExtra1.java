import java.util.Arrays;

public class ExmExtra1 {

    // 1. klavyeden satır ve sütün sayısı girilince dizi oluşturan metodu yazınız

    public static int[][] yeniDizi(int satir,int sutun){

        int dizi[][]=new int[satir][sutun];

        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <sutun ; j++) {
                dizi[i][j]= (int) (Math.random()*101);
            }
        }
        return dizi;
    }

    public static void main(String[] args) {

        int dizi[][]=yeniDizi(2,5);

        System.out.println(Arrays.deepToString(dizi));
    }

}
