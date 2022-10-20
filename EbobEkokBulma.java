import java.util.Scanner;
public class EbobEkokBulma {
    public static void main(String[]args){
        int n1,n2,nsmall,nbig,ebob=1,i,k,ekok,j=1,carpim,ekok2;
        Scanner input=new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        n1=input.nextInt();
        System.out.print("n2 sayısını giriniz:");
        n2=input.nextInt();
        if (n1>n2){
            nbig=n1;
            nsmall=n2;
        }else{
            nbig=n2;
            nsmall=n1;
        }
        i=1;
        while (i<=nsmall){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
          i++;
        }
        System.out.println("EBOB:"+ebob+" İlk yöntem");
        k=nsmall;
        while (k<=1){
            if (n1%k==0 && n2%k==0){
                ebob=k;
            }
            i--;
        }
        System.out.println("EBOB:"+ebob+" İkinci yöntem");
        System.out.println("***************************************");
        carpim=n1*n2;
        while (j<=carpim){
            j++;
            if (j%n1==0 && j%n2==0){
                ekok=j;
                System.out.println("EKOK :"+ekok+" İlk yöntem");
                break;
            }
        }
        ekok2=(n1*n2)/ebob;
        System.out.println("EKOK :"+ekok2+" İkinci Yöntem");
    }
}
