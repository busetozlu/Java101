import java.util.Scanner;
public class GelismisHesapMakinesi {
    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam:"+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma:"+result);
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpım:"+result);
        return result;
    }
    static int divided(int a,int b){
        if(b==0){
            System.out.println("İkinci sayı 0'dan farklı olmalıdır");
            return 0;
        }
        int result=a/b;
        System.out.println("Bölüm:"+result);
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for (int i=1; i<=b; i++){
          result*=a;
        }
        System.out.println("Üs Alma İşlemi:"+result);
        return result;
    }
    static int mod(int a,int b){
        int result;
        result=a%b;
        System.out.println("Mod Alma İşlemi:"+result);
        return result;
    }
    static void calc(int a,int b){
        System.out.println("Dikdörtenin Çevresi:"+(2*(a+b)));
        System.out.println("Dikdörtgenin Alanı:"+(a*b));
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int select;
        String menu="1-Toplama İşlemi\n"+
                "2-Çıkarma İşlemi\n"+
                "3-Çarpma İşlemi\n"+
                "4-Bölme İşlemi\n"+
                "5-Üslü Sayı Hesaplama\n"+
                "6-Mod Alma\n"+
                "7-Dikdörtgen Alan ve Çevre Hesabı\n"+
                "8-Çıkış Yap";
        System.out.println(menu);
        while (true){
            System.out.print("Lütfen İşlem Seçiniz:");
            select=input.nextInt();
            if (select==0){
                break;
            }
            System.out.print("İlk Sayıyı Giriniz:");
            int a=input.nextInt();
            System.out.print("İkinci Sayıyı Giriniz:");
            int b=input.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz!");
            }
        }
        System.out.println("Güle Güle");
    }
}
