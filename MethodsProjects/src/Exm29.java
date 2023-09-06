public class Exm29 {

    // 29. kendisine parametre olarak gelen iki boyutlu string dizisindeki en uzun stringi geri döndüren metod

    public static String enUzunString(String dizi[][]){

        String enu=dizi[0][0];

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j].length()>enu.length()){
                    enu=dizi[i][j];
                }
            }
        }
        return enu;
    }

    public static void main(String[] args) {

        String dizi[][]={{"aa","b"},{"ahahhhaha","ehe"}};
        System.out.println(enUzunString(dizi));
    }
}
