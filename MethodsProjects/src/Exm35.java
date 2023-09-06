import java.util.Arrays;

public class Exm35 {

    // kendisine parametre olarak gelen iki boyutlu string dizisindeki en uzun karaktere sahip stringin
    // yerini geri döndüren metod

    public static int[] uzunString(String dizi[][]){

        String enu=dizi[0][0];
        int sat=0;
        int sut=0;
        int yenidizi[]=new int[2];

        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j].length()>enu.length()){
                    enu=dizi[i][j];
                    sat=i;
                    sut=j;
                }
            }
        }
        yenidizi[0]=sat;
        yenidizi[1]=sut;

        return yenidizi;
    }

    public static void main(String[] args) {

        String dizi[][]={{"fatma","aleynadoğanfıratüniveritesi"},{"doğan","bilgisayarmühendisliği"}};

        System.out.println(Arrays.toString(uzunString(dizi)));
    }
}
