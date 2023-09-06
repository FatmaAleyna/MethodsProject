import java.util.Scanner;

public class Exm14 {

    // 14. kendisine parametre olarak gelen iki stringten uzun olanı geri döndüren metodu yaz

    public static String uzunString(String str1, String str2){

        String enu=str1;

        if (str1.length()>str2.length()){
            enu=str1;
        }  else{
            enu=str2;
        }
        return enu;
    }

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        String str1=k.nextLine();
        String str2=k.nextLine();

        System.out.println(uzunString(str1,str2));
    }
}
