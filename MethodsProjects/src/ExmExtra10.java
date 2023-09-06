public class ExmExtra10 {

    // 10. 2 boyutlu string dizisi içindeki her bir string içinde rakam olayanları ekrana yazdıran metod

    public static void rakamsız(String str [][] ){

        for (int i = 0; i < str.length ; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                String bos="";
                for (int k = 0; k <str[i][j].length() ; k++) {
                    if (str[i][j].charAt(k)-48>=0 && str[i][j].charAt(k)-48<=9){
                        continue;
                    }else{
                        bos=bos+str[i][j].charAt(k);
                    }
                }
                System.out.println(bos);
            }
        }
    }

    public static void main(String[] args) {

        String str[][]={{"abc","12t"},{"fat5","hede"}};

       rakamsız(str);

    }
}
