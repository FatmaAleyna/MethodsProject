import java.util.Arrays;

public class Exm24 {

    // 24. kendisine parametre olarak geşen tam sayı dizisindeki en büük ve en küçük sayıyı geri döndüren pr

    public static int[] enBuyukKucuk(int dizi[]){

        int enb=dizi[0];
        int enk=dizi[1];

        int dizi2[]=new int[2];

        for (int i = 0; i <dizi.length ; i++) {
            if (dizi[i]>enb){
                enb=dizi[i];
                dizi2[0]=enb;
            }
            if (dizi[i]<enk){
                enk=dizi[i];
                dizi2[1]=enk;
            }
        }
        return dizi2;
    }

    public static void main(String[] args) {

        int dizi[]={103,29,36,433,5};
        System.out.println(Arrays.toString(enBuyukKucuk(dizi)));
    }
}
