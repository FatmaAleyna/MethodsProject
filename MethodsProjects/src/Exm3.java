import java.util.Scanner;

public class Exm3 {

    // 3. kendisine parametre olarak gelen n tam sayısı kadar adınızı ekrana yazdıran metod

    public static String ad(int n){

        String isim="fatma";
        for (int i = 1; i <n ; i++) {
            System.out.println(isim);
        }
        return isim;
    }

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int n=k.nextInt();

        System.out.println(ad(n));
    }
}
