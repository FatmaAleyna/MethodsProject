public class Exm32 {

    // 32. kendisine parametre olarak gelen 10 elamamlı iki tam sayı dizisinin toplamını geri döndüren metod

    public static int toplamDondur(int a[], int b[]){

        int toplam=0;

        for (int i = 0; i <a.length ; i++) {
            toplam=toplam+(a[i]+b[i]);
        }
        return toplam;
    }

    public static void main(String[] args) {

        int a[]={1,2};
        int b[]={1,2};

        System.out.println(toplamDondur(a,b));
    }
}
