import java.util.Scanner;

public class Exm6 {

    // 6. kendisine parametre olarak gelen tam sayının faktöriyelinş geri döndüren metodu yazınız

    public static int faktoriyel(int sayi){

        int fak=1;
        for (int i =sayi; i >0 ; i--) {
            fak=fak*i;
        }
        return fak;
    }


    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int sayi=k.nextInt();

        System.out.println(faktoriyel(sayi));
    }
}
