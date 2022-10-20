import java.util.Scanner;
public class SayiMinMaxBulma {
    public static void main(String[]args){
        int n,max=1,min=1,number;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        n=input.nextInt();
        for (int i=1; i<=n; i++){
            System.out.print(i+". sayıyı giriniz:");
            number=input.nextInt();
            if (i==1){
                max=number;
                min=number;
            }else if (number>max){
                max=number;
            } else if (number<min) {
                min=number;
            }
        }
        System.out.println("En büyük sayı:"+max);
        System.out.print("En küçük sayı:"+min);

    }
}
