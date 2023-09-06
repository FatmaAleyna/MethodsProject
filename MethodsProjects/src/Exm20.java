public class Exm20 {

    // 20. kendisine parametre olarak gelen tam sayı dizisinin sıralı olup olmadığını geri döndüren metod

    public static boolean siraliMi(int dizi[]){

        boolean kontrol=true;
        for (int i = 0; i <dizi.length-1 ; i++) {
            for (int j = 0; j <dizi.length-1-i ; j++) {
                if (dizi[j+1]>dizi[j]){
                    kontrol=true;
                } else
                    kontrol=false;
            }
        }
        return kontrol;
    }

    public static void main(String[] args) {

        int dizi[]={11,2,3,4,5};
        System.out.println(siraliMi(dizi));
    }
}
