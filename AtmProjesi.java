import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String userName,password;
        int right=3;
        int balance=1500,price;
        int select;
        while (right>0){
            right--;
            System.out.print("Kullanıcı adı: ");
            userName=input.nextLine();
            System.out.print("Parola :");
            password=input.nextLine();
            if (userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz.");
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    select=input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Lütfen yatıracağınız miktarı giriniz:");
                            price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Lütfen çekeceğiniz miktarı giriniz:");
                            price=input.nextInt();
                            if (price>balance){
                                System.out.println("Bakiye Yetersiz");
                            }else {
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:"+balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            }else {
                System.out.println("Kullanıcı adı veya şifre hatalı.Tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.Banka ile görüşünüz.");
                }else {
                    System.out.println("Kalan hakkınız: "+right);
                }
            }
        }

    }
}
