import java.util.Scanner;
public class SinifiGecme {
    public static void main (String[]args){
        int mat,fizik,turkce,kimya,muzik;
        double ortalama;
        int sayac=0,toplamnot=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik Notu:");
        mat=inp.nextInt();
        if (mat<0 || mat>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }
        else {
            sayac+=1;
            toplamnot+=mat;
        }
        System.out.print("Fizik Notu:");
        fizik=inp.nextInt();
        if (fizik<0 || fizik>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }
        else {
            sayac+=1;
            toplamnot+=fizik;
        }
        System.out.print("Türkçe Notu:");
        turkce=inp.nextInt();
        if (turkce<0 || turkce>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");

        }
        else {
            sayac+=1;
            toplamnot+=turkce;
        }
        System.out.print("Kimya Notu:");
        kimya=inp.nextInt();
        if (kimya<0 || kimya>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");

        }
        else {
            sayac+=1;
            toplamnot+=kimya;
        }
        System.out.print("Müzik Notu:");
        muzik=inp.nextInt();
        if (muzik<0 || muzik>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }
        else {
            sayac+=1;
            toplamnot+=muzik;
        }
        ortalama=(toplamnot/sayac);
        if (ortalama>55)
        {
            System.out.println("Sınıfı geçtiniz, ortalamanız:"+ortalama);
        }
        else
        {
            System.out.println("Sınıfta kaldınız, ortalamanız:"+ortalama);
        }


    }
}
