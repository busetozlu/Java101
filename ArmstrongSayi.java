import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[]args) {
        /*
        DERSTE YAPILAN ARMSTRONG SAYI ÖRNEĞİ
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number= input.nextInt();
        int basNumber=0,tenpNumber=number;
        int basValue;
        int result=0;
        int basPow;
        while (tenpNumber!=0){
            tenpNumber/=10;
            basNumber++;
        }
        tenpNumber=number;
        while (tenpNumber!=0){
            basValue=tenpNumber%10;
            basPow=1;
            for (int i=1; i<=basNumber; i++)
            {
                basPow*=basValue;
            }
            result+=basPow;
            tenpNumber/=10;
        }
        if (result==number){
            System.out.print(number+" sayısı bir Armstrong sayıdır.");
        }
        else {
            System.out.println(number+" sayısı bir Armstrong sayı değildir.");
        }

         */
        //*******************ÖDEV*********************
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number= input.nextInt();
        int basNumber=0,tenpNumber=number;
        int basValue;
        int result=0;
        while (tenpNumber!=0){
            tenpNumber/=10;
            basNumber++;
        }
        tenpNumber=number;
        while (tenpNumber!=0){
            basValue=tenpNumber%10;
            //System.out.println(basValue);
            tenpNumber/=10;
            result+=basValue;

        }
        System.out.print("Basamak sayıları toplamı: "+result);

    }
}
