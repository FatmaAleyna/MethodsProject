public class ExmExtra11 {

    // 11. kendisine parametre olarak gelen sayıya kadar olan asal sayıları bulan ve ekrana yazan metod

    public static void asalBUl(int sayi) {

        boolean kontrol = true;

        for (int i = 2; i < sayi; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    kontrol = false;
            }

            if (kontrol)
                System.out.println(i);
            kontrol=true;
        }
    }


    public static void main(String[] args) {

        asalBUl(21);
    }
}
