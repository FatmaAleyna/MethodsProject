import java.util.Scanner;

public class Exm4 {

    // 4. kendisine paametre olarak gelen sayının kaç basamklı olduğunu geri döndüren metod

    public static int basamakSayisi(int sayi){

        int sayac=0;
        while (sayi%10>0){
            sayi=sayi/10;
            sayac++;
        }
        return sayac;
    }

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int sayi=k.nextInt();

        System.out.println(basamakSayisi(sayi));
    }
}
