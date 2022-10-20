import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[]args){
        int number,i=1,test=0,k;
        Scanner input=new Scanner(System.in);
        while (i<2){
            System.out.print("Bir sayı giriniz: ");
            number=input.nextInt();
            for (k=1; k<number; k++){
                if (number%k==0){
                    test+=k;
                }
            }
            if (number==test){
                System.out.println(number+" Mükemmel sayıdır");
            }else{
                System.out.println(number+" Mükemmel sayı değildir");
            }
            test=0;
        }
    }
}
