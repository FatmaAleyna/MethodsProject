public class ExmExtra4 {

    // 4. kendisine parametre olarak gelen 2 boyurlu strşng dizisindeki küçük boyuttaki karakterleri geri döndüren metodu yazınız

    public static String kucukKar(String dizi[][]){

        String bos="";

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                for (int k = 0; k <dizi[i][j].length() ; k++) {

                    char harf=dizi[i][j].charAt(k);
                    if (harf>='a' && harf<='z')
                        bos=bos+(char)(dizi[i][j].charAt(k));
                }
            }
        }
        return bos;
    }

    public static void main(String[] args) {

        String dizi[][]={{"aa"},{"Bd"}};

        System.out.println(kucukKar(dizi));
    }
}
