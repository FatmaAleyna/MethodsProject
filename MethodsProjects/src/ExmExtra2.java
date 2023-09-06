import java.util.Arrays;

public class ExmExtra2 {

// 2. kendisine parametre olarak gelen iki dizide her bir indisinte büyük olanı geri döndüren metodu yazınız

    public static int[] buyukOlan(int a[],int b[]){

        int sonuc[]=new int[a.length];

        for (int i = 0; i <a.length ; i++) {
            if (a[i]>b[i])
                sonuc[i]=a[i];
            else
                sonuc[i]=b[i];
        }
        return sonuc;
    }

    public static void main(String[] args) {

        int a[]={1,2,37,4,53};
        int b[]={0,24,3,44,5};

        System.out.println(Arrays.toString(buyukOlan(a,b)));
    }
}
