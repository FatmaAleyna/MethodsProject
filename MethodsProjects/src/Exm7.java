public class Exm7 {

    // 7. kendisine parmetre olarak gelen sayıya kadarki tüm sayıları topplayıp gferi döndüren metod

    public static int toplam(int sayi){

        int top=0;
        for (int i = 0; i <=sayi ; i++) {
            top=top+i;
        }
        return top;
    }

    public static void main(String[] args) {

        System.out.println(toplam(5));
    }
}
