import java.util.Scanner;
public class BolunenSayiOrtalama_For {
    public static void main (String[]args){
        int k,j=0,sum=0;
        double average;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k= input.nextInt();
        for (int i=1; i<=k; i++){
            if (i%3==0 && i%4==0){
                sum+=i;
                j++;
            }
        }
        if (j==0)
        {
            System.out.println("3'e ve 4'e tam bölünebilen sayı yoktur.");
        }
        else {
            average=sum/j;
            System.out.println(k+" sayısına kadar olan 3'e ve 4'e tam bölünen \nSayıların ortalaması:"+average);
        }

        /* VIDEO SONUNDA WHILE ILE YAPILMASI ÖNERİLDİ.
        int k,i=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k= input.nextInt();
        while (i<=k){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }*/
    }
}
