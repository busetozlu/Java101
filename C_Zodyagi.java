import java.util.Scanner;
public class C_Zodyagi {
    public static void main(String[]args){
        int year,zodyak;
        String animal="";
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        year= input.nextInt();
        zodyak=year%12;
        if (zodyak==0){
            animal="Maymun";
        }
        else if (zodyak==1){
            animal="Horoz";
        }
        else if (zodyak==2){
            animal="Köpek";
        }
        else if (zodyak==3){
            animal="Domuz";
        }
        else if (zodyak==4){
            animal="Fare";
        }
        else if (zodyak==5){
            animal="Öküz";
        }
        else if (zodyak==6){
            animal="Kaplan";
        }
        else if (zodyak==7){
            animal="Tavşan";
        }
        else if (zodyak==8){
            animal="Ejderha";
        }
        else if (zodyak==9){
            animal="Yılan";
        }
        else if (zodyak==10){
            animal="At";
        }
        else if (zodyak==11){
            animal="Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz: "+animal);
    }
}
