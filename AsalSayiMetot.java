import java.util.Scanner;
public class AsalSayiMetot {
    static boolean number(int a,int i){

        if(a<=2){
            return (a==2) ? true : false;
        }
        if(a % i ==0){
            return false;
        }
        if(i>a/2)
            return true;

        return number(a,i+1);
    }
    public static void main(String[]args){
        while (true){
            Scanner inp=new Scanner(System.in);
            System.out.print("Sayı Giriniz:");
            int a=inp.nextInt();
            if(number(a,2)){
                System.out.println(a+" Sayısı ASALDIR !");
            }
            else
                System.out.println(a+" Sayısı ASAL değildir !");
        }

    }
}
