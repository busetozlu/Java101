import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[]args){
        Random rnd = new Random();
        int number= rnd.nextInt(100);
        System.out.println(number);
        Scanner inp=new Scanner(System.in);
        int luck=0;
        int select=0;
        int [] selected=new int[5];
        for (int i=0; i<5; i++){
            selected[luck++]=select;
            System.out.print("Tahmininizi giriniz:");
            select=inp.nextInt();

            if (select>0 && select<100){
                if(select==number){
                    System.out.println("Tahmininiz doğrudur sayı : "+number);
                   break;
                }
                else {
                    System.out.println("Hatalı sayı girdiniz, Kalan Hakkınız: "+(5-luck));
                    if (select<number){
                        System.out.println(select+" Sayısı gizli sayıdan küçüktür");
                    }
                    else {
                        System.out.println(select+" Sayısı gizli sayıdan büyüktür");
                    }

                }

            }else {
                i--;
                luck--;
                System.out.println("0-100 arası olmalıdır! Kalan hakkınız : "+(5-luck));

            }
            if (luck==5 && number!=select){
                System.out.println("Kaybettiniz, Tahminleriniz : "+ Arrays.toString(selected)+"Gizli Sayı : "+number);
            }
        }


    }
}
