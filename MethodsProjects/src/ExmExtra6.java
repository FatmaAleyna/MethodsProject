import java.util.Scanner;

public class ExmExtra6 {

    // 6. kullanıcı arafından girilen bir sayının basamaklarının toplamını veren metod

    public static double basToplamı(double sayi) {

        double toplam = 0;

        while (sayi > 0) {
            toplam =toplam+ (sayi % 10.0);
            sayi =sayi/10.0;
        }
        return toplam;
    }

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        double sayi=k.nextInt();

        System.out.println(basToplamı(sayi));

    }
}