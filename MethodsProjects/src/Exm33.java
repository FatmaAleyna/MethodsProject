import java.util.Scanner;

public class Exm33 {

    // 33. kendisine parametre olarak gelen tam sayının asal olup olmadığını geri döndüren metod

    public static boolean asalMi(int sayi){

        boolean kontrol=true;

        for (int i = 2; i <sayi ; i++) {
                if ((sayi%i)==0){
                    kontrol=false;
                    break;
                }
        }
        return kontrol;
    }

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int sayi=k.nextInt();

        System.out.println(asalMi(sayi));
    }
}
