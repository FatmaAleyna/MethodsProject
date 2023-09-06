public class Exm17 {

    // 17. kendisine parametre olarak stringin palindrom olup olmadığını kontrol eden metod

    public static boolean palindrom(String str){

        boolean kontrol=true;
        int bas=0;
        int son=str.length()-1;

        while (bas>son){
            if (str.charAt(bas)!=str.charAt(son)){
                kontrol=false;
            } else
                kontrol=true;
            bas++;
            son--;
        }
        return kontrol;
    }

    public static void main(String[] args) {

        System.out.println(palindrom("nalan"));
    }
}
