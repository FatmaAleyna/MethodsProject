public class Exm8 {

    // 8. kendisine parametre olarak gelen iki tam sayıdan büyük olanı geri döndüren metod

    public static int buyuk(int a , int b){

        int enb=a;

        if (a>b){
            enb=a;
        }else{
            enb=b;
        }
        return enb;
    }

    public static void main(String[] args) {

        System.out.println(buyuk(45,-1));
    }
}
