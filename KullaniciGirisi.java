import java.util.Scanner;
public class KullaniciGirisi {
    public static void main (String[]args){
        String password,userName,newPassword,oldPassword="java123";
        byte select;
        Scanner inp=new Scanner(System.in);
        System.out.print("Kullanıcı adınız:");
        userName=inp.nextLine();
        System.out.print("Şifreniz:");
        password=inp.nextLine();
        if (userName.equals("Patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız");
        }
        else{
            System.out.println("Bilgileriniz yanlış\nŞifreyi değiştirmek ister misiniz ?\n1-Evet 2-Hayır");
            select=inp.nextByte();
            if (select==1){
                System.out.print("Yeni parolanızı giriniz:");
                newPassword=inp.next();
                if (newPassword.equals(password)){
                    System.out.println("Şifre oluşrulamadı lütfen başka şifre giriniz");
                }
                else if(newPassword.equals(oldPassword)){
                    System.out.println("Şifre oluşrulamadı lütfen başka şifre giriniz");
                }
                else{
                    System.out.println("Yeni şifre oluşturuldu");
                }

            }
        }

    }
}
