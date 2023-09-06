public class Exm5 {

    // 5. n. fibonacchi sayını geri döndüren metodu yazınız

    public static int fibonacchi(int a , int b,int n){

         int c=0;

        for (int i = 1; i <n ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }


    public static void main(String[] args) {

        System.out.println(fibonacchi(0,1,4));
    }
}
