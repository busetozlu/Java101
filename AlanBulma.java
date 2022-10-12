import java.util.Scanner;
public class AlanBulma {
    public static void main(String[]args) {
        int kenar1,kenar2,kenar3;
        double alan,u;
        Scanner inp=new Scanner(System.in);
        System.out.print("1.Kenarın uzunluğunu giriniz:");
        kenar1= inp.nextInt();
        System.out.print("2.Kenarın uzunluğunu giriniz:");
        kenar2= inp.nextInt();
        System.out.print("3.Kenarın uzunluğunu giriniz:");
        kenar3= inp.nextInt();
        u=((kenar1+kenar2+kenar3)/2);
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Alan:"+alan);


    }

}
