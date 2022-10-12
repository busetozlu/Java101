import java.util.Scanner;
public class DaireAlanÇevreHesaplama {
    public static void main(String[]args) {
        /*int r;
        double pi=3.14,alan,cevre;
        Scanner inp=new Scanner(System.in);
        System.out.print("Yarıçapı giriniz:");
        r=inp.nextInt();
        cevre=2*pi*r;
        System.out.println("Çevre="+cevre);
        alan=pi*r*r;
        System.out.println("Alan="+alan);*/
        int r;
        double pi=3.14,alan,alfa;
        Scanner inp=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        r=inp.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü giriniz :");
        alfa=inp.nextInt();
        alan=(pi*(r*r)*alfa)/360;
        System.out.println("Dairenin Diliminin Alanı:"+alan);




    }
}
