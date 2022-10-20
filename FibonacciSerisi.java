import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n,n1=0,n2=1;
        System.out.print("Fibonacci serisi eleman sayısı:");
        n=input.nextInt();
        int result=0;
        for (int i=1;i<=n;i++){
            n1=n2;
            n2=result;
            result=n1+n2;
            System.out.println(result);
        }

    }
}
