public class Exm22 {

    // 22. kendisine parametre olarak gelen string dizisindeki en uzun stringin indisini geri döndüğren metod

    public  static int uzunString(String dizi[]){

        String enu=dizi[0];
        int enuindis=0;
        for (int i = 0; i <=dizi.length-1 ; i++) {
            if (dizi[i].length()>enu.length()){
                enu=dizi[i];
                enuindis=i;
            }
        }
        return enuindis;
    }

    public static void main(String[] args) {

        String dizi[]={"aa","bbb"};
        System.out.println(uzunString(dizi));
    }
}
