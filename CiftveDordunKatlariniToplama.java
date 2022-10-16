import java.util.Scanner;
public class CiftveDordunKatlariniToplama {
    public static void main(String[]args){
       int i,total=0;
        Scanner input=new Scanner(System.in);
       do {
           System.out.print("Sayı giriniz:");
           i= input.nextInt();
           if(i % 2==0 && i%4==0) {
               total+=i;
           }
       }while (i%2==0);
        System.out.println("Girilen çift ve dördün katları olan sayıların toplamı: "+total);
    }

}
