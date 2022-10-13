import java.util.Scanner;
public class HavaSicakligiEtkinlik {
    public static void main (String[]args){
        int heat;
        Scanner input=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz:");
        heat=input.nextInt();
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat<15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        if (heat>5 && heat<25){
            System.out.println("Pikniğe gidebilirsiniz");
        } else if (heat>25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
