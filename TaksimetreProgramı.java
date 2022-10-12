import java.util.Scanner;
public class TaksimetreProgramı {
    public static void main(String[]args) {
        double km,taksimetre,min=20.0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Km giriniz:");
        km=inp.nextDouble();
        taksimetre=(km*2.20)+10;
        boolean kisamesafe= (taksimetre<20.0) ;
        boolean normalmesafe=(taksimetre>=20.0);
        double sonuc=((normalmesafe)? taksimetre:min);
        System.out.print("Taksimetre:"+sonuc+" TL");

    }
}
