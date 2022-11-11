import java.util.Scanner;
public class PalindromikKelimeBulma {
    static boolean isPalindrom(String str){
        for (int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(str.length()-1)){
                return true;
            }
        }
        return false;
    }
    public static void main (String[]args){
        String str;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kelimeyi giriniz : ");
        str=inp.nextLine();
        if (isPalindrom(str)){
            System.out.println("Kelime Palindromik " + str);
        } else {
            System.out.println("Kelime Palindromik DEĞİLDİR! " + str);
        }
    }
}
