import java.util.Scanner;

public class Exm9 {

    // 9. kendisine parametre olarak gelen stringteki küçük karakterlerin sayısını döndüren metod

    public  static int kucukKarakter(String str){

        int sayac=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                sayac++;
            }
        }
        return sayac;
    }

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        String str=k.nextLine();

        System.out.println(kucukKarakter(str));
    }
}
