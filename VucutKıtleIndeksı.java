import java.util.Scanner;
public class VucutKıtleIndeksı {
    public static void main (String[]args){
        double boy,kg,indeks;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre) cinsinde giriniz:");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kg=inp.nextDouble();
        indeks=(kg/(boy*boy));
        System.out.println("Vücut kitle indeksiniz:"+indeks);



    }
}
