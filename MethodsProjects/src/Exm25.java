public class Exm25 {

    // 25. vize ve final sınavlarını iki dizi olarak parametre alıp öğrencilerin ortalamasını hesaplayıp geri döndüren metod

    public static int ort(int vize[], int finaal[]){

        int toplam1=0;
        int toplam2=0;
        int ortalama=0;

        for (int i = 0; i <= vize.length-1  ; i++) {
            toplam1=toplam1+vize[i];
            toplam2=toplam2+finaal[i];
            ortalama=(toplam1+toplam2)/vize.length;
        }
        return ortalama;
    }

    public static void main(String[] args) {

        int vize[]={50,60};
        int finaal[]={50,60};

        System.out.println(ort(vize,finaal));
    }
}
