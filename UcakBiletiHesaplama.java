import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int distance,age,tripType;
        double ageDiscount,normalAmount,discountAmount,extDiscount,totalAmount;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi (km) cinsinden giriniz:");
        distance=input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        age=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1=>Tek Yön 2=>Gidiş-Dönüş):");
        tripType=input.nextInt();
        if (distance>=1 && age>=1 && tripType<=2 && tripType>=1 ){
            normalAmount=distance*0.10;
            if (age<12){
                ageDiscount=normalAmount*0.50;
                discountAmount=normalAmount-ageDiscount;
            }
            else if(age>12 && age<24){
                ageDiscount=normalAmount*0.10;
                discountAmount=normalAmount-ageDiscount;
            }
            else if (age>65){
                ageDiscount=normalAmount*0.30;
                discountAmount=normalAmount-ageDiscount;
            }
            else {
                discountAmount=normalAmount;
            }
            if (tripType==2){
                extDiscount=discountAmount*0.20;
                totalAmount=(discountAmount-extDiscount)*2;
                System.out.print("Toplam Fiyat:"+totalAmount+" TL");

            }
            else{
                System.out.print("Toplam Fiyat:"+discountAmount+" TL");
            }

        }
        else{
            System.out.println("Hatalı veri girdiniz !");
        }



    }
}
