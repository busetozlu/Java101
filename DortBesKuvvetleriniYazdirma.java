import java.util.Scanner;

public class DortBesKuvvetleriniYazdirma {
    public static void main(String[]args){
        int i,number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz:");
        number=input.nextInt();
        System.out.println("4'ün Kuvvetleri;");
        for (i=1; i<=number; i*=4){
            System.out.println(i);
        }
        System.out.println("5'in Kuvvetleri:");
        for (i=1; i<=number; i*=5){
            System.out.println(i);
        }
    }
}
