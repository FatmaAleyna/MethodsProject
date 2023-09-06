import java.util.Arrays;

public class Exm30 {

    // 30. kendisine parametre olarak gelen 3x3 lük a ve b matrislerinin toplamını geri döndüren metod

    public static int[][] matrisToplamı(int a [][],int b [][]){

        int toplamMAtris[][]=new int[a.length][b.length];

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                toplamMAtris[i][j]=a[i][j]+b[i][j];
            }
        }
        return toplamMAtris;
    }

    public static void main(String[] args) {

        int a[][]=new int[3][3];
        int b[][]=new int[3][3];

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                a[i][j]=(int)(Math.random()*101);
                b[i][j]=(int)(Math.random()*101);
            }
        }
        System.out.println(Arrays.deepToString(matrisToplamı(a,b)));
    }
}
