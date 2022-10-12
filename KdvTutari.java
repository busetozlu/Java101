import java.util.Scanner;
public class KdvTutari {
    public static void main(String[]args) {
        double fiyat,kdvlifiyat,kdvtutari;
        Scanner inp=new Scanner(System.in);
        System.out.print("Fiyatı Giriniz:");
        fiyat=inp.nextInt();
        boolean yuksekoran=(fiyat<1000);
        boolean dusukoran=(fiyat>1000);
        double kdvorani= (yuksekoran)? 0.18:0.08;
        kdvtutari=fiyat*kdvorani;
        kdvlifiyat=(fiyat+(fiyat*kdvorani));
        System.out.println("Kdv'li Fiyat:"+kdvlifiyat);
        System.out.print("Kdv Tutarı:"+kdvtutari);



    }
}
