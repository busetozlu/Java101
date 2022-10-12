import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main (String[]args)
    {
        double armutK,elmaK,domatesK,muzK,patlicanK,armutF,elmaF,domatesF,muzF,patlicanF,toplamF;
        Scanner inp=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutK=inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elmaK=inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domatesK=inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muzK=inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanK=inp.nextDouble();
        armutF= (armutK*2.14);
        elmaF=(elmaK*3.67);
        domatesF=(domatesK*1.11);
        muzF=(muzK*0.95);
        patlicanF=(patlicanK*5.00);
        toplamF=armutF+elmaF+domatesF+muzF+patlicanF;
        System.out.println("Toplam Tutar:"+toplamF+" TL");

    }
}
