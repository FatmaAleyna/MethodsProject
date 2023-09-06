public class Exm26 {

    // kendisine parametre olarak gelen iki boyutlu tam sayı dizisindeki en büyük sayıyı geri döndüren metod

    public static int enBuyuk(int dizi[][]){

        int enb=dizi[0][0];

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j]>enb){
                    enb=dizi[i][j];
                }
            }
        }
        return enb;
    }

    public static void main(String[] args) {

        int dizi[][]={{1,2,3},{4,5,6}};
        System.out.println(enBuyuk(dizi));
    }
}
