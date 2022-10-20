import java.util.Scanner;
public class TersUcgenYapimi {
    public static void main(String[]args){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        n=input.nextInt();
        for (int z = 0; z <= n; z++) {
            for (int m =1; m<=z ; m++) {
                System.out.print(" ");
            }
            for (int b =1; b<=(2*n-2*z-1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
