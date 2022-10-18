import java.util.Scanner;
public class YildizlarIleUcgen_Elmas_Yapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* UCGEN YAPIMI
        int n;
        System.out.print("n sayısını giriniz:");
        n=input.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
            }*/
        // *******ÖDEV - ELMAS YAPIMI*********
        int n;
        System.out.print("Elmas için n sayısını giriniz: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int z = 1; z <= n; z++) {
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

