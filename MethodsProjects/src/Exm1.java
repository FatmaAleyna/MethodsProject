import java.util.Scanner;

public class Exm1 {

    // 1. kendisinr parametre olarak gelen iki tam sayının toplamını geri döndüren metodu yazınız


    public static int topla(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int a=k.nextInt();
        int b=k.nextInt();
        System.out.println(topla(a,b));

        // iki farklı şekilde ekrana yazdırabiliriz

        int toplam=topla(a,b);
        System.out.println(toplam);
    }
}