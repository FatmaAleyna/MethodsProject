import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class Exm2 {

    // 2. kendisine parametre olarak gelen iki tam sayıyı a üzeri b şeklinde hesaplayaıp geri döndüren metod

    public static int us(int a, int b){

        int sonuc=1;
        for (int i = 1; i <=b ; i++) {
            sonuc=sonuc*a;
        }
        return sonuc;
    }

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int a=k.nextInt();
        int b=k.nextInt();

        System.out.println(us(a,b));
    }
}
