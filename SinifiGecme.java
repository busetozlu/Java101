import java.util.Scanner;
public class SinifiGecme {
    public static void main (String[]args){
        int mat,fizik,turkce,kimya,muzik;
        double ortalama;
        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik Notu:");
        mat=inp.nextInt();
        System.out.print("Fizik Notu:");
        fizik=inp.nextInt();
        System.out.print("Türkçe Notu:");
        turkce=inp.nextInt();
        System.out.print("Kimya Notu:");
        kimya=inp.nextInt();
        System.out.print("Müzik Notu:");
        muzik=inp.nextInt();
        if (mat!=0 && mat!=100 && fizik!=0 && fizik!=100 && turkce!=0 && turkce!=100 && kimya!=0 && kimya!=100 && muzik!=0 && muzik!=100 ){
            ortalama=(mat+fizik+turkce+kimya+muzik)/5.0;
            System.out.println("Ortalama:"+ortalama);
            if (ortalama>55)
            {
                System.out.println("Sınıfı Geçti");
            }
            else{
                System.out.println("Sınıfta Kaldı");
            }
        }


    }
}
