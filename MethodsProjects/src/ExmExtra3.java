import java.util.Arrays;

public class ExmExtra3 {

    // 3. kendisine parametre  olarak gelen tek boyutlu iki dizinin toplamını geri döndüren metodu yazınız

    public static int[] diziToplamı(int a[],int b[]){

        int sonuc=0;
        int toplam[]=new int[a.length];

        for (int i = 0; i <a.length ; i++) {
            sonuc=a[i]+b[i];
            toplam[i]=sonuc;
        }
        return toplam;
    }

    public static void main(String[] args) {

        int a[]={1,2};
        int b[]={1,2};

        System.out.println(Arrays.toString(diziToplamı(a,b)));
    }
}
