import java.util.Scanner;
public class FaktoriyelHesabi {
    public static void main(String[]args){
        int i,n,r,k,ntotal=1,rtotal=1,total=0,ktotal=1;
        Scanner input=new Scanner(System.in);
        System.out.println("C(n,r) = n! / (r! * (n-r)!) hesaplayacağız");
        System.out.print("n için değer:");
        n=input.nextInt();
        System.out.print("r için değer:");
        r=input.nextInt();
        k=n-r;
        for (i=1; i<=n; i++){
            ntotal*=i;
        }
        for (i=1; i<=r; i++){
            rtotal*=i;
        }
        for (i=1; i<=k; i++){
            ktotal*=i;
        }
        total=ntotal/(rtotal*ktotal);
        System.out.print("C(n,r) ="+total);

    }

}
